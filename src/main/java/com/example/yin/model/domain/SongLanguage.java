package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 语言支持表
 * @date 2023/7/15 15:36
 */
@TableName(value = "m_song_language")
@Data
public class SongLanguage {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer languageId;
}
