package com.xiucai.mybatisplus;

import com.alibaba.fastjson.JSON;
import com.xiucai.mybatisplus.mapper.UserMapper;
import com.xiucai.mybatisplus.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * @author xiucai
 * @date 2022/12/25 11:33
 * @description MybatisPlus工程的测试类
 */
@SpringBootTest
public class MyBatisPlusMapperTest {
    @Resource
    private UserMapper userMapper;

    /**
     * 测试查所有的方法
     */
    @Test
    public void testSelectAllList() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(JSON.toJSONString(userList));
    }

    /**
     * 测试插入的方法
     */
    @Test
    public void testInsert() {
        User user = new User();

        user.setName("zhangsan");
        user.setAge(18);
        user.setEmail("111111@qq.com");

        System.out.println("result: " + userMapper.insert(user));
        System.out.println(JSON.toJSONString(user));
    }

    /**
     * 测试删除方法
     */
    @Test
    public void testDelete() {
        System.out.println("result: " + userMapper.deleteById(1606932172017537025L));
    }

    /**
     * 测试修改方法
     */
    @Test
    public void testUpdate() {
        User user = userMapper.selectById(1L);
        user.setAge(99);

        System.out.println("result: " + userMapper.updateById(user));
    }

    /**
     * 测试查询方法
     */
    @Test
    public void testSelect() {
        //自己定义的查询方法
        Map<String, Object> result = userMapper.selectMapById(1L);
        System.out.println(JSON.toJSONString(result));
    }

}
