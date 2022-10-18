package com.example.redis.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wxz
 * @date 14:51 2022/10/18
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 测试链接redis
     *
     * @return java.lang.String
     * @author wxz
     * @date 14:54 2022/10/18
     */
    @GetMapping
    public String redis() {
        redisTemplate.opsForValue().set("name", "lucy");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }
}
