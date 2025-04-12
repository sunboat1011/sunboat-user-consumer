package com.sunboat.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/db")
public class ConnectController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public List<Map<String, Object>> testDatabaseConnection() {
        return jdbcTemplate.queryForList("SELECT 1");
    }
}