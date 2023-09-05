package com.example.yin.DTO;

import com.baomidou.mybatisplus.annotation.*;
import com.example.yin.model.domain.Song;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author MI
 * @version 1.0
 * @description:
 * @date 2023/7/15 8:31
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value = "m_song")
@Data
public class SongBaseDTO extends Song {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer systemId;

    private Integer levelOneId;

    private Integer state;

    private String supportLanguage;

    private int songUid;

    private Integer songId;

    private Integer songNumber;

    private String desc;

    private String author;

    private String releaseTime;

    private String theme;

    private String musicCover;

    private Integer language;

    private String backstory;

    @TableField(fill = FieldFill.INSERT)
    private Data time;

    private String songName;

    private String url;

    private String lyric;

}
