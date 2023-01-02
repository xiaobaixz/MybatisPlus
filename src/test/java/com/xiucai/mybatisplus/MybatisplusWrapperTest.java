package com.xiucai.mybatisplus;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiucai.mybatisplus.mapper.UserMapper;
import com.xiucai.mybatisplus.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import javax.annotation.Resource;

/**
 * @author xiucai
 * @date 2022/12/25 22:16
 * @description
 */
@SpringBootTest
public class MybatisplusWrapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.gt("age", 23).orderByAsc("age");

        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(JSON.toJSONString(userList));
    }
}
