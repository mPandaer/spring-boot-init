package com.pandaer.project.modules.user.service.impl;
import java.time.LocalDateTime;

import com.pandaer.project.cache.core.config.CacheProperties;
import com.pandaer.project.server.modules.user.entity.User;
import com.pandaer.project.server.modules.user.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Resource
    private CacheManager cacheManager;

    @Resource CacheProperties cacheProperties;


    @Resource
    private RedisTemplate<String,Object> redisTemplate;


    @Test
    public void add() {
        User user = new User();
        user.setUsername("name");
        user.setPassword("pwd");
        user.setEmail("liwenhaolx@gmailc.om");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userService.addUser(user);
    }

    @Test
    public void cache() {
        Cache cache = cacheManager.getCache(cacheProperties.getDefaultCacheName());
        assert cache != null;
        cache.put("my","pandaer");
        Object my = cache.get("my").get();
        System.out.println(my);
    }

    @Test
    public void cacheTemplate() {
        redisTemplate.opsForValue().set("hi",999);
        Object hello = redisTemplate.opsForValue().get("hi");
        System.out.println(hello);
    }

}