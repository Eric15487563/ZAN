package com.example.yin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yin.DTO.SongDTO;
import com.example.yin.common.R;
import com.example.yin.model.domain.Song;
import org.apache.ibatis.javassist.NotFoundException;

import java.util.List;

public interface SongService extends IService<Song> {
    R selectSong();

    //    分页
    SongDTO getAllSongs(int page, int size, Integer levelOneId);

    //    根据songNUmber
    SongDTO getSongsByLevelOneIdAndSongUid(Integer levelOneId, String songNumber, int page, int pageSize);

    //    根据关键词查询
    SongDTO getSongsByLevelOneIdAndKeyword(Integer levelOneId, String keyword, int page, int pageSize);

    //  主键查询
    Song getSongById(Integer id);

    //    搜索功能
    List<Song> searchSongs(String keyword, int page, int pageSize);

    Integer getIdBySongUid(String songUid) throws NotFoundException;

    List<Song> selectFirstNineSongs();

    List<Song> selectFirstNineSongs1();

    Song getUrlById(Integer id);

    Integer getIdByUrlUid(String songUid) throws NotFoundException;

}
