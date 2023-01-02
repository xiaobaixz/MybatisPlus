package com.xiucai.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiucai.mybatisplus.pojo.User;

import java.util.Map;

/**
 * @author xiucai
 * @date 2022/12/25 11:18
 * @description
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * mp有一个默认的扫描路径，所有yml文件中其实可以不配置指定的路径的
     */
    Map<String, Object> selectMapById(Long id);
}
