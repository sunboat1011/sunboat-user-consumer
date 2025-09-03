package com.sunboat.business.controller;

import com.sunboat.common.core.result.RtnResult;
import com.sunboat.common.core.utils.RedisTemplateUtils;
import com.sunboat.common.core.utils.RedissonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/db")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
//
    @Autowired
    private RedissonUtils redissonUtils;

    @Autowired
    private RedisTemplateUtils redisTemplateUtils;

    @GetMapping("/test")
    public List<Map<String, Object>> testDatabaseConnection() {

        return jdbcTemplate.queryForList("SELECT 1");
    }

    @GetMapping("/testRedis")
    public RtnResult<HashMap<String,Object>> testRedisTemplateUtils() {
        HashMap<String,Object> stringObjectHash = null;
        Integer testNum = redisTemplateUtils.getString("sunboat");
        stringObjectHash = new HashMap<>();
        stringObjectHash.put("sunboat",testNum);
        return RtnResult.success(stringObjectHash);
    }
}