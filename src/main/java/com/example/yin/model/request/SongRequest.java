package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 歌曲主表
 * @date 2023/7/15 8:58
 */
@TableName(value = "m_song")
@Data
public class SongRequest {

    private Integer id;

    private Integer systemId;

    private Integer levelOneId;

    private Integer state;

    private String supportLanguage;

    private Integer songNumber;
}
