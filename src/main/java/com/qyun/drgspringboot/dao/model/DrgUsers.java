package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_users")
public class DrgUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 用户ID

    @TableField("username")
    private String username;  // 用户名

    @TableField("email")
    private String email;  // 用户邮箱

    @TableField("password")
    private String password;  // 用户密码

    @TableField("role_id")
    private Integer roleId;  // 角色ID

    @TableField("created_at")
    private LocalDateTime createdAt;  // 注册时间

    @TableField("updated_at")
    private LocalDateTime updatedAt;  // 更新时间
}
