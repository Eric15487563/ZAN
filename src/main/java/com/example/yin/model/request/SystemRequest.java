package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author MI
 * @version 1.0
 * @description: 系统表请求
 * @date 2023/7/15 8:22
 */
@TableName(value = "m_system")
@Data
public class SystemRequest {

    private Integer id;

    private String name;

    private Date time;

    private Integer state;
}
