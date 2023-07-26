package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:44
 */
@TableName(value = "m_song_lyric")
@Data
public class SongLyricRequest {
    private Integer id;

    private Integer songId;

    private String language;

    private Data creationTime;

    private Data updateTime;

    private Integer fileId;


}
