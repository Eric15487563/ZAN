package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author MI
 * @version 1.0
 * @description: 声部表
 * @date 2023/7/15 15:52
 */
@TableName("m_song_vocal")
@Data
public class SongVocal {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer language;

    private Integer voiceStep;

    private Integer mediaType;

    @TableField(fill = FieldFill.INSERT)
    private Date creationTime;  // 使用 java.util.Date 类型

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;    // 使用 java.util.Date 类型

    private Integer fileId;
}
