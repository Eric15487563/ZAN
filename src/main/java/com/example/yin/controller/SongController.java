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
    public ResponseEntity<R<SongDTO>> getAllSongs(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(required = false) Integer levelOneId,
            @RequestParam(required = false) String songNumber,
            @RequestParam(required = false) String keyword) {

        SongDTO songDTO;
        R<SongDTO> response;

        if (songNumber != null && !songNumber.isEmpty()) {
            // 根据levelOneId和songUid精确查询
            log.info("NUm = {}", songNumber);
            songDTO = songService.getSongsByLevelOneIdAndSongUid(levelOneId, songNumber, page, pageSize);
        } else if (keyword != null && !keyword.isEmpty()) {
            // 在levelOneId基础上模糊查询
            songDTO = songService.getSongsByLevelOneIdAndKeyword(levelOneId, keyword, page, pageSize);
        } else {
            // 正常分页查询
            songDTO = songService.getAllSongs(page, pageSize, levelOneId);
        }
        //  判断是否成功获取
        if (songDTO != null) {
            response = R.success("获取成功", songDTO);
        } else {
            response = R.error("获取失败");
        }

        return ResponseEntity.ok(response);
    }

    //    通过关键词查询 所有数据
    @GetMapping("/searchSong")
    public ResponseEntity<R<List<Song>>> searchSongs(@RequestParam("keyword") String keyword,
                                                     @RequestParam("page") int page,
                                                     @RequestParam("pageSize") int pageSize) {
        List<Song> songs = songService.searchSongs(keyword, page, pageSize);
        R<List<Song>> response = R.success("Success", songs);
        return ResponseEntity.ok(response);
    }

    //    按ID主键查询
    @GetMapping("/SongDetail")
    public ResponseEntity<R<Song>> getSongById(@RequestParam("songUid") String songUid) throws NotFoundException {
        Integer id = songService.getIdBySongUid(songUid);
        Song song = songService.getSongById(id);
        R<Song> response = R.success("获取成功", song);
        return ResponseEntity.ok(response);
    }

    //    返回热门歌曲 9
    @GetMapping("/hotList")
    public ResponseEntity<R<List<Song>>> hotSong() {
        List<Song> firstNineSongs = songService.selectFirstNineSongs();
        R<List<Song>> response = R.success("获取成功", firstNineSongs);
        return ResponseEntity.ok(response);
    }


    //    返回推荐歌曲 12
    @GetMapping("/recommend")
    public ResponseEntity<R<List<Song>>> recommendSong() {
        List<Song> firstNineSongs = songService.selectFirstNineSongs1();
        R<List<Song>> response = R.success("获取成功", firstNineSongs);
        return ResponseEntity.ok(response);
    }

    //    获取指定歌曲URL  getSongUrl
    @GetMapping("/getSongUrl")
    public ResponseEntity<R<Song>> getUrlById(@RequestParam("songUid") String songUid) throws NotFoundException {
        Integer id = songService.getIdByUrlUid(songUid);
        Song song = songService.getUrlById(id);
        R<Song> response = R.success("获取成功", song);
        return ResponseEntity.ok(response);
    }
}
