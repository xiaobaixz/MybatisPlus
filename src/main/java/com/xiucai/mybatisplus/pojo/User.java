package com.xiucai.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

/**
 * @author xiucai
 * @date 2022/12/25 11:10
 * @description 用户的实体
 */
@Data
public class User {

    @TableId
    private Long uid;

    private String name;

    private Integer age;

    private String email;

}
