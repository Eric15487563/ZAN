package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description:曲谱表
 * @date 2023/7/15 15:48
 */
@TableName(value = "m_song_score")
@Data
public class SongScore {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer language;

    private Integer mediaType;

    @TableField(fill = FieldFill.INSERT)
    private Data creationTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data updateTime;

    private Integer scoreType;

    private Integer fileId;
}
