package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 分类表请求
 * @date 2023/7/15 8:30
 */
@TableName(value = "m_class")
@Data
public class ClassRequest {
    private Integer id;

    private Integer levelId;

    private String name;

    private Integer classType;

    private String desc;

    private Data time;

    private Integer state;
}