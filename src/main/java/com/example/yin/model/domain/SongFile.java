package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: 歌曲文件表
 * @date 2023/7/15 14:46
 */
@TableName(value = "m_song_file")
@Data
public class SongFile {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String url;

    private Integer fileSize;

    private String suffix;
}
