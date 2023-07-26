package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 伴奏资源表
 * @date 2023/7/15 15:31
 */
@TableName(value = "m_song_accompaniment")
@Data
public class SongAccompaniment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer media_type;

    @TableField(fill = FieldFill.INSERT)
    private Data creationTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data updateTime;

    private Integer fileId;
}
