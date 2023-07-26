package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:35
 */
@TableName(value = "m_song_accompaniment")
@Data
public class SongAccompanimentRequest {
    private Integer id;

    private Integer songId;

    private Integer media_type;

    private Data creationTime;

    private Data updateTime;

    private Integer fileId;
}
