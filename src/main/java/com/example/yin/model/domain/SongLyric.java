package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 歌词资源表
 * @date 2023/7/15 15:39
 */
@TableName(value = "m_song_lyric")
@Data
public class SongLyric {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private String language;

    @TableField(fill = FieldFill.INSERT)
    private Data creationTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data updateTime;

    private Integer fileId;
}
