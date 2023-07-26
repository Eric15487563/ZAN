package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.lang.reflect.Type;

/**
 * @author MI
 * @version 1.0
 * @description: 歌曲信息表
 * @date 2023/7/15 14:40
 */
@TableName(value = "m_song_information")
@Data
public class SongInformation {
    @TableId(type = IdType.AUTO)
    private Integer songUid;

    private Integer songId;

//    private Integer songNumber;

    private String desc;

    private String author;

    private String releaseTime;

    private String theme;

    private String musicCover;

    private Integer language;

    private String backstory;

    @TableField(fill = FieldFill.INSERT)
    private Data time;

    private Integer state;

//    private String songName;
//
//    private String url;

    private String lyric;

//    private Integer recommend;
//
//    private Integer hot;
}
