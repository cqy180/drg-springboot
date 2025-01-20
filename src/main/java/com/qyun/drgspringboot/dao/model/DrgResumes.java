package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_resumes")
public class DrgResumes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 简历ID

    @TableField("user_id")
    private Integer userId;  // 用户ID

    @TableField("template_id")
    private Integer templateId;  // 模板ID

    @TableField("personal_info")
    private String personalInfo;  // 个人信息 (JSON 格式)

    @TableField("created_at")
    private LocalDateTime createdAt;  // 创建时间

    @TableField("updated_at")
    private LocalDateTime updatedAt;  // 更新时间
}