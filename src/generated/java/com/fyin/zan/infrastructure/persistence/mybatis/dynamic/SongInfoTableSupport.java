package com.fyin.zan.infrastructure.persistence.mybatis.dynamic;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SongInfoTableSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    public static final SongInfoTable songInfoTable = new SongInfoTable();

    /**
     * Database Column Remarks:
     *   信息ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.id")
    public static final SqlColumn<Integer> id = songInfoTable.id;

    /**
     * Database Column Remarks:
     *   关联歌曲ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.song_id")
    public static final SqlColumn<Integer> songId = songInfoTable.songId;

    /**
     * Database Column Remarks:
     *   歌曲编号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.song_number")
    public static final SqlColumn<Integer> songNumber = songInfoTable.songNumber;

    /**
     * Database Column Remarks:
     *   作者
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.author")
    public static final SqlColumn<String> author = songInfoTable.author;

    /**
     * Database Column Remarks:
     *   发布时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.release_time")
    public static final SqlColumn<String> releaseTime = songInfoTable.releaseTime;

    /**
     * Database Column Remarks:
     *   主题风格
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.theme")
    public static final SqlColumn<String> theme = songInfoTable.theme;

    /**
     * Database Column Remarks:
     *   封面地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.music_cover")
    public static final SqlColumn<String> musicCover = songInfoTable.musicCover;

    /**
     * Database Column Remarks:
     *   语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.language")
    public static final SqlColumn<Integer> language = songInfoTable.language;

    /**
     * Database Column Remarks:
     *   添加时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.time")
    public static final SqlColumn<LocalDateTime> time = songInfoTable.time;

    /**
     * Database Column Remarks:
     *   状态 默认1：开启 0：关闭
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.state")
    public static final SqlColumn<Integer> state = songInfoTable.state;

    /**
     * Database Column Remarks:
     *   歌曲名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.name")
    public static final SqlColumn<String> name = songInfoTable.name;

    /**
     * Database Column Remarks:
     *   默认歌曲文件
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.url")
    public static final SqlColumn<String> url = songInfoTable.url;

    /**
     * Database Column Remarks:
     *   1 为推荐  0为正常
     *   12
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.recommend")
    public static final SqlColumn<Integer> recommend = songInfoTable.recommend;

    /**
     * Database Column Remarks:
     *   1 为推荐  0为正常
     *   9
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.hot")
    public static final SqlColumn<Integer> hot = songInfoTable.hot;

    /**
     * Database Column Remarks:
     *   描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.desc")
    public static final SqlColumn<String> desc = songInfoTable.desc;

    /**
     * Database Column Remarks:
     *   背景故事
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.backstory")
    public static final SqlColumn<String> backstory = songInfoTable.backstory;

    /**
     * Database Column Remarks:
     *   默认歌词文件
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song_information.lyric")
    public static final SqlColumn<String> lyric = songInfoTable.lyric;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song_information")
    public static final class SongInfoTable extends AliasableSqlTable<SongInfoTable> {
        public final SqlColumn<Integer> id = column("`id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> songId = column("`song_id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> songNumber = column("`song_number`", JDBCType.INTEGER);

        public final SqlColumn<String> author = column("`author`", JDBCType.VARCHAR);

        public final SqlColumn<String> releaseTime = column("`release_time`", JDBCType.VARCHAR);

        public final SqlColumn<String> theme = column("`theme`", JDBCType.VARCHAR);

        public final SqlColumn<String> musicCover = column("`music_cover`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> language = column("`language`", JDBCType.INTEGER);

        public final SqlColumn<LocalDateTime> time = column("`time`", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> state = column("`state`", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("`url`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommend = column("`recommend`", JDBCType.INTEGER);

        public final SqlColumn<Integer> hot = column("`hot`", JDBCType.INTEGER);

        public final SqlColumn<String> desc = column("`desc`", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> backstory = column("`backstory`", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> lyric = column("`lyric`", JDBCType.LONGVARCHAR);

        public SongInfoTable() {
            super("`m_song_information`", SongInfoTable::new);
        }
    }
}