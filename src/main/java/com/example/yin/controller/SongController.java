package com.example.yin.controller;

import com.example.yin.DTO.SongDTO;
import com.example.yin.common.R;
import com.example.yin.model.domain.Song;
import com.example.yin.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SongController {
    @Autowired
    private SongService songService;

    // 返回所有歌曲
    @GetMapping("/song")
    public R selectSong() {
        return songService.selectSong();
    }

    //    分页查询歌曲数据
    @GetMapping("/songList")
    public ResponseEntity<SongDTO> getAllSongs(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(required = false) Integer levelOneId,
            @RequestParam(required = false) String songNumber,
            @RequestParam(required = false) String keyword) {


        SongDTO songDTO;

        if (songNumber != null && songNumber != "") {
            // 根据levelOneId和songUid精确查询
            log.info("NUm = {}", songNumber);
            songDTO = songService.getSongsByLevelOneIdAndSongUid(levelOneId, songNumber, page, pageSize);
        } else if (keyword != null && keyword != "") {
            // 在levelOneId基础上模糊查询
            songDTO = songService.getSongsByLevelOneIdAndKeyword(levelOneId, keyword, page, pageSize);
        } else {
            // 正常分页查询
            songDTO = songService.getAllSongs(page, pageSize, levelOneId);
        }

        return ResponseEntity.ok(songDTO);
    }

    //    通过关键词查询 所有数据
    @GetMapping("/searchSong")
    public List<Song> searchSongs(@RequestParam("keyword") String keyword,
                                  @RequestParam("page") int page,
                                  @RequestParam("pageSize") int pageSize) {
        return songService.searchSongs(keyword, page, pageSize);
    }

    //    按ID主键查询
    @GetMapping("/SongDetail")
    public Song getSongById(@RequestParam("songUid") String songUid) throws NotFoundException {
        Integer id = songService.getIdBySongUid(songUid);
        return songService.getSongById(id);
    }

    //    返回热门歌曲 9
    @GetMapping("/hotList")
    public List<Song> hotSong() {
        List<Song> firstNineSongs = songService.selectFirstNineSongs();
        return (firstNineSongs);
    }

    //    返回推荐歌曲 12
    @GetMapping("/recommend")
    public List<Song> recommendSong() {
        List<Song> firstNineSongs = songService.selectFirstNineSongs1();
        return (firstNineSongs);
    }

    //    获取指定歌曲URL  getSongUrl
    @GetMapping("/getSongUrl")
    public Song getUrlById(@RequestParam("songUid") String songUid) throws NotFoundException {
        Integer id = songService.getIdByUrlUid(songUid);
        return songService.getUrlById(id);
    }
}
