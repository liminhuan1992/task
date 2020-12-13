package com.redisDemo;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis.auth("test");
    }
}
