package io.github.lyking2001.example.spring.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.lyking2001.example.spring.pojo.User;
import io.github.lyking2001.example.spring.service.UserService;

/**
 * MyBatis测试
 *
 * @author lyking2001
 */
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = userService.getUserById(1);
        logger.info(user.getName());
    }
}
