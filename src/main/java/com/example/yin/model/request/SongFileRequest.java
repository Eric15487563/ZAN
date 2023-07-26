package com.example.yin.model.request;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/15 14:48
 */
@TableName(value = "m_song_file")
@Data
public class SongFileRequest {
    private Integer id;

    private String url;

    private Integer fileSize;

    private String suffix;
}

