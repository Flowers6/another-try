package com.prison.anotherTryMvn.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 测试用用户表
 * @TableName test_user
 */
@TableName(value ="test_user")
@Data
public class TestUser {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码（加密后）
     */
    @TableField(value = "password")
    private String password;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 性别(0-未知,1-男,2-女)
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 状态(0-禁用,1-启用)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 出生日期
     */
    @TableField(value = "birth_date")
    private Date birthDate;

    /**
     * 最后登录时间
     */
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}