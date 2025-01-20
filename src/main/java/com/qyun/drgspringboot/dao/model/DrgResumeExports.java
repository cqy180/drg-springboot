package com.qyun.drgspringboot.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("drg_resume_exports")
public class DrgResumeExports implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 导出记录ID

    @TableField("resume_id")
    private Integer resumeId;  // 简历ID

    @TableField("export_format")
    private String exportFormat;  // 导出格式

    @TableField("export_time")
    private LocalDateTime exportTime;  // 导出时间

    @TableField("file_path")
    private String filePath;  // 文件路径
}
