package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 15:52
 */
@TableName(value = "m_song_score")
@Data
public class SongScoreRequest {
    private Integer id;

    private Integer songId;

    private Integer language;

    private Integer mediaType;

    private Data creationTime;

    private Data updateTime;

    private Integer scoreType;

    private Integer fileId;

}
