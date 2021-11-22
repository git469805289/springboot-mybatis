package com.mgm;

import com.alibaba.druid.util.JdbcUtils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
class SpringbootMybatisApplicationTests {


    @Test
    void contextLoads() throws SQLException {

        System.out.println("A Test");

    }




}
