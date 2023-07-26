package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 语言表
 * @date 2023/7/15 15:28
 */
@TableName(value = "m_language")
@Data
public class Language {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String language;

    private String desc;
}
