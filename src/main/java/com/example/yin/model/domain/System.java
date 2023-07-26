package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author MI
 * @version 1.0
 * @description: 系统表
 * @date 2023/7/15 8:16
 */
@TableName(value = "m_system")
@Data
public class System {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Date time;

    private Integer state;
}
