package com.ome.http;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClient {
	public static void test() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://localhost");
		CloseableHttpResponse respone = httpClient.execute(httpGet);
		// 底层的HTTP连接仍然由响应对象保存
		// 以允许响应内容直接从网络套接字流式传输。
		// 为了确保正确地释放系统资源
		// 用户必须从finally子句中调用CloseableHttpResponse.close()。
		// 请注意，如果响应内容没有被完全消耗，底层连接将无法安全地重用，并且会被连接管理器关闭并丢弃。
		InputStream inputStream = null;
		FileOutputStream out = null;
		try {
			System.out.println(respone.getStatusLine());
			HttpEntity entity = respone.getEntity();
			// EntityUtils.consume(entity);
			if (null != entity) {
				inputStream = entity.getContent();
				out = new FileOutputStream(new File("e:/%E8%B6%85%E5%93%81%E5%B7%AB%E5%B8%88.txt"));
				int i;
				byte[] tmp = new byte[1024];
				while ((i = inputStream.read(tmp)) != -1) {
					System.out.println(i + "%");
					out.write(tmp);
					out.flush();
				}
			}
		} finally {
//			if (inputStream != null) {
//				inputStream.close();
//			}
			if (out != null) {
				out.close();
			}
			respone.close();
			System.out.println("下载完成");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
