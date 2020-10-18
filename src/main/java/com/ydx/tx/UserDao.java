package com.ydx.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    public void insert(){
        String sql = "insert into user(username,age) values (?,?)";
        String userName = UUID.randomUUID().toString().substring(0,5);
        jdbcTemplate.update(sql,userName,19);
        int i = 10 /0;
    }

}
