package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:30
 */
@TableName(value = "m_language")
@Data
public class LanguageRequest {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String language;

    private String desc;
}
