package com.mgm.controller;

import com.mgm.mapper.UserMapper;
import com.mgm.pojo.User;
import com.mgm.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JDBCController
 * @Description TODO
 * @Author mgm
 * @Date 2021/11/20 15:08
 * @Version 1.0
 */
@RestController
public class JDBCController {

    @Autowired
    UserMapper userMapper;


    @GetMapping("/queryUserList")
    public List<User> queryUserList() {
        UserExample userExample = new UserExample();
        String orderByClause = userExample.getOrderByClause();
        List<User> users = userMapper.selectByExample(userExample);
        for (User user : users) {
            System.out.println(user);
        }
        return users;

    }

    @RequestMapping("/delete")

    public void delete(){
        userMapper.deleteByPrimaryKey(4);

    }

}
