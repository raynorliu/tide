package com.ome.redis;


import redis.clients.jedis.Jedis;

public class RedisUtil {
	public static void main(String[] args) {
		init();
	}

	public static void init() {
		Jedis jedis = new Jedis("18.191.1.177",6379);
		jedis.auth("liugy");
//		jedis.set("hello", "你好");
		System.out.println(jedis.get("hello"));
	}

}
