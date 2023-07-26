package com.example.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yin.DTO.SongDTO;
import com.example.yin.common.R;
import com.example.yin.mapper.SongMapper;
import com.example.yin.model.domain.Song;
import com.example.yin.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
@Slf4j
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {

    @Autowired
    private SongMapper songMapper;

    // 返回所有歌曲
    @Override
    public R selectSong() {
        List<Song> list = songMapper.selectSong();
        return R.success("获取成功", list);
    }

    // 分页按levelOneId查询
    @Override
    public SongDTO getAllSongs(int page, int pageSize, Integer levelOneId) {
        // 计算偏移量和限制数
        int offset = (page - 1) * pageSize;
        int limit = pageSize;
        List<Song> songs;
        int totalSongs;
        if (levelOneId != null && levelOneId == 0) {
            // 返回所有音乐数据
            songs = songMapper.selectAllSongs(levelOneId, offset, limit);
            totalSongs = songMapper.countAllSongs(); // 获取总记录数
        } else {
            // 根据 levelOneId 进行分页查询
            songs = songMapper.selectSongsByLevelOneId(levelOneId, offset, limit);
            totalSongs = songMapper.countTotalSongsByLevelOneId(levelOneId); // 查询符合条件的总记录数
        }

        return getSongDTO(levelOneId, page, pageSize, songs, totalSongs);
    }

    @Override
    public SongDTO getSongsByLevelOneIdAndSongUid(Integer levelOneId, String songNumber, int page, int pageSize) {
        // 计算偏移量和限制数
        int offset = (page - 1) * pageSize;
        int limit = pageSize;

        List<Song> songs = songMapper.selectSongsByLevelOneIdAndSongUid(levelOneId, songNumber, offset, limit);
        int totalSongs = songMapper.countTotalSongsByLevelOneIdAndSongUid(levelOneId, songNumber);
        return getSongDTO(levelOneId, page, pageSize, songs, totalSongs);
    }

    @Override
    public SongDTO getSongsByLevelOneIdAndKeyword(Integer levelOneId, String keyword, int page, int pageSize) {
        // 计算偏移量和限制数
        int offset = (page - 1) * pageSize;
        int limit = pageSize;

        List<Song> songs = songMapper.selectSongsByLevelOneIdAndKeyword(levelOneId, keyword, offset, limit);
        int totalSongs = songMapper.countTotalSongsByLevelOneIdAndKeyword(levelOneId, keyword);
        return getSongDTO(levelOneId, page, pageSize, songs, totalSongs);
    }

    private SongDTO getSongDTO(Integer levelOneId, int page, int pageSize, List<Song> songs, double totalSongs) {
        int totalPages = (int) Math.ceil(totalSongs / pageSize);

        SongDTO songDTO = new SongDTO();
        songDTO.setLevelOneId(levelOneId);
        songDTO.setSongs(songs);
        songDTO.setPage(page);
        songDTO.setTotalPages(totalPages);
        songDTO.setTotalSongs((int) totalSongs);

        return songDTO;
    }

    //搜索
    @Override
    public List<Song> searchSongs(String keyword, int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return songMapper.searchSongs(keyword, offset, pageSize);
    }


    @Override
    public Song getSongById(Integer id) {
        return songMapper.selectSongById(id);
    }

    public Integer getIdBySongUid(String songUid) throws NotFoundException {
        // 根据 songUid 查询对应的 id 值
        Song song = songMapper.findBySongUid(songUid);
        if (song != null) {
            return song.getId();
        } else {
            throw new NotFoundException("Song not found");
        }
    }

    @Override
    public List<Song> selectFirstNineSongs() {
        return songMapper.findFirstNineSongs();
    }

    @Override
    public List<Song> selectFirstNineSongs1() {
        return songMapper.findFirstNineSongs1();
    }

    @Override
    public Song getUrlById(Integer id) {
        return songMapper.selectUrlById(id);
    }

    public Integer getIdByUrlUid(String songUid) throws NotFoundException {
        // 根据 songUid 查询对应的 id 值
        Song song = songMapper.findByUrlUid(songUid);
        if (song != null) {
            return song.getId();
        } else {
            throw new NotFoundException("Song not found");
        }
    }
}
