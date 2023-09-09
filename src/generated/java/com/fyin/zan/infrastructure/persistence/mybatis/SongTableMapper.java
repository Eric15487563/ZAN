package com.fyin.zan.infrastructure.persistence.mybatis;

import static com.fyin.zan.infrastructure.persistence.mybatis.dynamic.SongInfoTableSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.fyin.zan.infrastructure.persistence.mybatis.model.SongInfoRow;
import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SongTableMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    BasicColumn[] selectList = BasicColumn.columnList(id, songId, songNumber, author, releaseTime, theme, musicCover, language, time, state, name, url, recommend, hot, desc, backstory, lyric);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SongInfoRow> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SongInfoRowResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="song_id", property="songId", jdbcType=JdbcType.INTEGER),
        @Result(column="song_number", property="songNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="release_time", property="releaseTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="theme", property="theme", jdbcType=JdbcType.VARCHAR),
        @Result(column="music_cover", property="musicCover", jdbcType=JdbcType.VARCHAR),
        @Result(column="language", property="language", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend", property="recommend", jdbcType=JdbcType.INTEGER),
        @Result(column="hot", property="hot", jdbcType=JdbcType.INTEGER),
        @Result(column="desc", property="desc", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="backstory", property="backstory", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="lyric", property="lyric", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SongInfoRow> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SongInfoRowResult")
    Optional<SongInfoRow> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int insert(SongInfoRow row) {
        return MyBatis3Utils.insert(this::insert, row, songInfoTable, c ->
            c.map(songId).toProperty("songId")
            .map(songNumber).toProperty("songNumber")
            .map(author).toProperty("author")
            .map(releaseTime).toProperty("releaseTime")
            .map(theme).toProperty("theme")
            .map(musicCover).toProperty("musicCover")
            .map(language).toProperty("language")
            .map(time).toProperty("time")
            .map(state).toProperty("state")
            .map(name).toProperty("name")
            .map(url).toProperty("url")
            .map(recommend).toProperty("recommend")
            .map(hot).toProperty("hot")
            .map(desc).toProperty("desc")
            .map(backstory).toProperty("backstory")
            .map(lyric).toProperty("lyric")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int insertSelective(SongInfoRow row) {
        return MyBatis3Utils.insert(this::insert, row, songInfoTable, c ->
            c.map(songId).toPropertyWhenPresent("songId", row::getSongId)
            .map(songNumber).toPropertyWhenPresent("songNumber", row::getSongNumber)
            .map(author).toPropertyWhenPresent("author", row::getAuthor)
            .map(releaseTime).toPropertyWhenPresent("releaseTime", row::getReleaseTime)
            .map(theme).toPropertyWhenPresent("theme", row::getTheme)
            .map(musicCover).toPropertyWhenPresent("musicCover", row::getMusicCover)
            .map(language).toPropertyWhenPresent("language", row::getLanguage)
            .map(time).toPropertyWhenPresent("time", row::getTime)
            .map(state).toPropertyWhenPresent("state", row::getState)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(url).toPropertyWhenPresent("url", row::getUrl)
            .map(recommend).toPropertyWhenPresent("recommend", row::getRecommend)
            .map(hot).toPropertyWhenPresent("hot", row::getHot)
            .map(desc).toPropertyWhenPresent("desc", row::getDesc)
            .map(backstory).toPropertyWhenPresent("backstory", row::getBackstory)
            .map(lyric).toPropertyWhenPresent("lyric", row::getLyric)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default Optional<SongInfoRow> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default List<SongInfoRow> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default List<SongInfoRow> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default Optional<SongInfoRow> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, songInfoTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    static UpdateDSL<UpdateModel> updateAllColumns(SongInfoRow row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(songId).equalTo(row::getSongId)
                .set(songNumber).equalTo(row::getSongNumber)
                .set(author).equalTo(row::getAuthor)
                .set(releaseTime).equalTo(row::getReleaseTime)
                .set(theme).equalTo(row::getTheme)
                .set(musicCover).equalTo(row::getMusicCover)
                .set(language).equalTo(row::getLanguage)
                .set(time).equalTo(row::getTime)
                .set(state).equalTo(row::getState)
                .set(name).equalTo(row::getName)
                .set(url).equalTo(row::getUrl)
                .set(recommend).equalTo(row::getRecommend)
                .set(hot).equalTo(row::getHot)
                .set(desc).equalTo(row::getDesc)
                .set(backstory).equalTo(row::getBackstory)
                .set(lyric).equalTo(row::getLyric);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SongInfoRow row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(songId).equalToWhenPresent(row::getSongId)
                .set(songNumber).equalToWhenPresent(row::getSongNumber)
                .set(author).equalToWhenPresent(row::getAuthor)
                .set(releaseTime).equalToWhenPresent(row::getReleaseTime)
                .set(theme).equalToWhenPresent(row::getTheme)
                .set(musicCover).equalToWhenPresent(row::getMusicCover)
                .set(language).equalToWhenPresent(row::getLanguage)
                .set(time).equalToWhenPresent(row::getTime)
                .set(state).equalToWhenPresent(row::getState)
                .set(name).equalToWhenPresent(row::getName)
                .set(url).equalToWhenPresent(row::getUrl)
                .set(recommend).equalToWhenPresent(row::getRecommend)
                .set(hot).equalToWhenPresent(row::getHot)
                .set(desc).equalToWhenPresent(row::getDesc)
                .set(backstory).equalToWhenPresent(row::getBackstory)
                .set(lyric).equalToWhenPresent(row::getLyric);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int updateByPrimaryKey(SongInfoRow row) {
        return update(c ->
            c.set(songId).equalTo(row::getSongId)
            .set(songNumber).equalTo(row::getSongNumber)
            .set(author).equalTo(row::getAuthor)
            .set(releaseTime).equalTo(row::getReleaseTime)
            .set(theme).equalTo(row::getTheme)
            .set(musicCover).equalTo(row::getMusicCover)
            .set(language).equalTo(row::getLanguage)
            .set(time).equalTo(row::getTime)
            .set(state).equalTo(row::getState)
            .set(name).equalTo(row::getName)
            .set(url).equalTo(row::getUrl)
            .set(recommend).equalTo(row::getRecommend)
            .set(hot).equalTo(row::getHot)
            .set(desc).equalTo(row::getDesc)
            .set(backstory).equalTo(row::getBackstory)
            .set(lyric).equalTo(row::getLyric)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    default int updateByPrimaryKeySelective(SongInfoRow row) {
        return update(c ->
            c.set(songId).equalToWhenPresent(row::getSongId)
            .set(songNumber).equalToWhenPresent(row::getSongNumber)
            .set(author).equalToWhenPresent(row::getAuthor)
            .set(releaseTime).equalToWhenPresent(row::getReleaseTime)
            .set(theme).equalToWhenPresent(row::getTheme)
            .set(musicCover).equalToWhenPresent(row::getMusicCover)
            .set(language).equalToWhenPresent(row::getLanguage)
            .set(time).equalToWhenPresent(row::getTime)
            .set(state).equalToWhenPresent(row::getState)
            .set(name).equalToWhenPresent(row::getName)
            .set(url).equalToWhenPresent(row::getUrl)
            .set(recommend).equalToWhenPresent(row::getRecommend)
            .set(hot).equalToWhenPresent(row::getHot)
            .set(desc).equalToWhenPresent(row::getDesc)
            .set(backstory).equalToWhenPresent(row::getBackstory)
            .set(lyric).equalToWhenPresent(row::getLyric)
            .where(id, isEqualTo(row::getId))
        );
    }
}