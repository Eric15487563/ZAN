package com.example.yin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yin.model.domain.Song;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//歌曲mapper层

@Repository
public interface SongMapper extends BaseMapper<Song> {
    List<Song> selectSong();

    List<Song> selectSongsByLevelOneId(Integer levelOneId, int offset, int limit);

    int countTotalSongsByLevelOneId(Integer levelOneId);

    List<Song> selectAllSongs(@Param("levelOneId") Integer levelOneId, @Param("offset") int offset, @Param("limit") int limit);

    int countAllSongs();

    List<Song> selectSongsByLevelOneIdAndSongUid(@Param("levelOneId") Integer levelOneId, @Param("songNumber") String songNumber, @Param("offset") int offset, @Param("limit") int limit);

    int countTotalSongsByLevelOneIdAndSongUid(@Param("levelOneId") Integer levelOneId, @Param("songNumber") String songNumber);

    List<Song> selectSongsByLevelOneIdAndKeyword(@Param("levelOneId") Integer levelOneId, @Param("keyword") String keyword, @Param("offset") int offset, @Param("limit") int limit);

    int countTotalSongsByLevelOneIdAndKeyword(@Param("levelOneId") Integer levelOneId, @Param("keyword") String keyword);


    List<Song> searchSongs(@Param("keyword") String keyword,
                           @Param("offset") int offset,
                           @Param("pageSize") int pageSize);

    Song selectSongById(Integer id);

    Song findBySongUid(String songUid);

    List<Song> findFirstNineSongs();

    List<Song> findFirstNineSongs1();

    Song selectUrlById(Integer id);

    Song findByUrlUid(String songUid);

}
