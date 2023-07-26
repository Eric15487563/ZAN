package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 14:45
 */
@TableName(value = "m_song_information")
@Data
public class SongInformationRequest {
    private Integer id;

    private Integer songId;

    private Integer songNumber;

    private String desc;

    private String author;

    private String releaseTime;

    private String theme;

    private String musicCover;

    private Integer language;

    private String backstory;

    private Data time;

    private Integer state;

    private String name;
}
