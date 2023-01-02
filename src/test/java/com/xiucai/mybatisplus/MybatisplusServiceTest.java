package com.xiucai.mybatisplus;

import com.xiucai.mybatisplus.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author xiucai
 * @date 2022/12/25 17:23
 * @description
 */
@SpringBootTest
public class MybatisplusServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testGetCount() {
        System.out.println(userService.count());
    }
}
