package com.example.yin.DTO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author MI
 * @version 1.0
 * @description:
 * @date 2023/7/15 8:31
 */
@TableName(value = "m_song")
@Data
public class SongCoverDTO {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songNumber;

    private int songUid;

    private String songName;

    private String musicCover;

    private Integer recommend;

    private Integer hot;
}
