package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_template_modules")
public class DrgTemplateModules implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 模板模块ID

    @TableField("template_id")
    private Integer templateId;  // 模板ID

    @TableField("module_type")
    private String moduleType;  // 模块类型

    @TableField("module_title")
    private String moduleTitle;  // 模块标题

    @TableField("is_required")
    private Boolean isRequired;  // 是否必填

    @TableField("created_at")
    private LocalDateTime createdAt;  // 创建时间

    @TableField("updated_at")
    private LocalDateTime updatedAt;  // 更新时间
}
