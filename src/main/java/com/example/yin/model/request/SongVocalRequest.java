package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:55
 */
@TableName("m_song_vocal")
@Data
public class SongVocalRequest {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer language;

    private Integer voiceStep;

    private Integer mediaType;

    @TableField(fill = FieldFill.INSERT)
    private Data creationTime;

    private Data updateTime;

    private Integer fileId;

}
