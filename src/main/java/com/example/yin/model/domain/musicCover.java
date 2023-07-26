package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/24 10:23
 */
@TableName(value = "m_song_information")
@Data
public class musicCover {
    @TableId(type = IdType.AUTO)
    private Integer songUid;
    private String musicCover;

    private Integer recommend;

    private Integer hot;
}
