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

import java.util.List;

//  歌曲Impl层

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

    // 分页按levelOneId分页查询
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

    //    根据一级分类 按照 songNum分页查询
    @Override
    public SongDTO getSongsByLevelOneIdAndSongUid(Integer levelOneId, String songNumber, int page, int pageSize) {
        // 计算偏移量和限制数
        int offset = (page - 1) * pageSize;

        List<Song> songs = songMapper.selectSongsByLevelOneIdAndSongUid(levelOneId, songNumber, offset, pageSize);
        int totalSongs = songMapper.countTotalSongsByLevelOneIdAndSongUid(levelOneId, songNumber);
        return getSongDTO(levelOneId, page, pageSize, songs, totalSongs);
    }

    //    按照一级分类 按照 songName 关键词 模糊查询
    @Override
    public SongDTO getSongsByLevelOneIdAndKeyword(Integer levelOneId, String keyword, int page, int pageSize) {
        // 计算偏移量和限制数
        int offset = (page - 1) * pageSize;
        int limit = pageSize;

        List<Song> songs = songMapper.selectSongsByLevelOneIdAndKeyword(levelOneId, keyword, offset, limit);
        int totalSongs = songMapper.countTotalSongsByLevelOneIdAndKeyword(levelOneId, keyword);
        return getSongDTO(levelOneId, page, pageSize, songs, totalSongs);
    }

    //
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

    //  搜索
    @Override
    public List<Song> searchSongs(String keyword, int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return songMapper.searchSongs(keyword, offset, pageSize);
    }

    //  通过ID主键查询
    @Override
    public Song getSongById(Integer id) {
        return songMapper.selectSongById(id);
    }

    //    通过songID 查询 返回对应ID值
    public Integer getIdBySongUid(String songUid) throws NotFoundException {
        // 根据 songUid 查询对应的 id 值
        Song song = songMapper.findBySongUid(songUid);
        if (song != null) {
            return song.getId();
        } else {
            throw new NotFoundException("Song not found");
        }
    }

    //  获取最热歌曲
    @Override
    public List<Song> selectFirstNineSongs() {
        return songMapper.findFirstNineSongs();
    }

    //  获取推荐歌曲
    @Override
    public List<Song> selectFirstNineSongs1() {
        return songMapper.findFirstNineSongs1();
    }

    //    根据ID查询 返回URL
    @Override
    public Song getUrlById(Integer id) {
        return songMapper.selectUrlById(id);
    }

    //    根据songID 查询 ID
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
