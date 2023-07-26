package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: MV表
 * @date 2023/7/15 15:44
 */
@TableName(value = "m_song_mv")
@Data
public class SongMv {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private String language;

    private Integer mediaType;

    @TableField(fill = FieldFill.INSERT)
    private Data creationTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data update;

    private Integer fileId;
}
