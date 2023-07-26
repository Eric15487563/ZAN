package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.w3c.dom.Text;

/**
 * @author MI
 * @version 1.0
 * @description: 分类表
 * @date 2023/7/15 8:26
 */
@TableName(value = "m_class")
@Data
public class Class {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer levelId;

    private String name;

    private Integer classType;

    private String desc;

    @TableField(fill = FieldFill.INSERT)
    private Data time;

    private Integer state;
}
