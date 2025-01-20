package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_resume_modules")
public class DrgResumeModules implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 模块ID

    @TableField("resume_id")
    private Integer resumeId;  // 简历ID

    @TableField("module_type")
    private String moduleType;  // 模块类型

    @TableField("module_title")
    private String moduleTitle;  // 模块标题

    @TableField("module_content")
    private String moduleContent;  // 模块内容 (JSON 格式)

    @TableField("created_at")
    private LocalDateTime createdAt;  // 创建时间

    @TableField("updated_at")
    private LocalDateTime updatedAt;  // 更新时间
}
