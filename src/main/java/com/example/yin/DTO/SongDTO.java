package com.example.yin.DTO;

import com.example.yin.model.domain.Song;
import lombok.Data;

import java.util.List;

/**
 * @author MI
 * @version 1.0
 * @description: TODO
 * @date 2023/7/21 9:55
 */
@Data
public class SongDTO {
    private Integer levelOneId;
    private List<Song> songs;
    private int page;
    private int totalPages;
    private int totalSongs;

    // 省略构造函数、getter和setter方法
}
