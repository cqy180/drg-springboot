package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_templates")
public class DrgTemplates implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 模板ID

    @TableField("name")
    private String name;  // 模板名称

    @TableField("description")
    private String description;  // 模板描述

    @TableField("created_at")
    private LocalDateTime createdAt;  // 创建时间

    @TableField("updated_at")
    private LocalDateTime updatedAt;  // 更新时间
}
