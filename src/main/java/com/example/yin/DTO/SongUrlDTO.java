package com.example.yin.DTO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.yin.model.domain.Song;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author MI
 * @version 1.0
 * @description:
 * @date 2023/7/26 10:07
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value = "m_song")
@Data
public class SongUrlDTO extends Song {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songNumber;

    private int songUid;

    private String songName;

    private String url;
}
