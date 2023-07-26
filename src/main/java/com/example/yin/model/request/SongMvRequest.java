package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:47
 */
@TableName(value = "m_song_mv")
@Data
public class SongMvRequest {
    private Integer id;

    private Integer songId;

    private String language;

    private Integer mediaType;

    private Data creationTime;

    private Data update;

    private Integer fileId;
}
