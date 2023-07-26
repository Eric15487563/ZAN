package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author MI
 * @version 1.0
 * @description: 歌曲主表
 * @date 2023/7/15 8:31
 */
@TableName(value = "m_song")
@Data
public class Song {


    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer systemId;

    private Integer levelOneId;

    private Integer state;

    private String supportLanguage;

    private Integer songNumber;
}
