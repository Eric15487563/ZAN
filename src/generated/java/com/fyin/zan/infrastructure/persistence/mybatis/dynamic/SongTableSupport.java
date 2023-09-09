package com.fyin.zan.infrastructure.persistence.mybatis.dynamic;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SongTableSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song")
    public static final SongTable songTable = new SongTable();

    /**
     * Database Column Remarks:
     *   赞美诗ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.id")
    public static final SqlColumn<Integer> id = songTable.id;

    /**
     * Database Column Remarks:
     *   关联系统ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.system_id")
    public static final SqlColumn<Integer> systemId = songTable.systemId;

    /**
     * Database Column Remarks:
     *   关联一级分类
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.level_one_id")
    public static final SqlColumn<Integer> levelOneId = songTable.levelOneId;

    /**
     * Database Column Remarks:
     *   关联二级分类
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.level_two_id")
    public static final SqlColumn<Integer> levelTwoId = songTable.levelTwoId;

    /**
     * Database Column Remarks:
     *   状态 1：开启 0：关闭
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.state")
    public static final SqlColumn<Integer> state = songTable.state;

    /**
     * Database Column Remarks:
     *   支持语言
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.support_language")
    public static final SqlColumn<String> supportLanguage = songTable.supportLanguage;

    /**
     * Database Column Remarks:
     *   歌曲编码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: m_song.song_number")
    public static final SqlColumn<Integer> songNumber = songTable.songNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: m_song")
    public static final class SongTable extends AliasableSqlTable<SongTable> {
        public final SqlColumn<Integer> id = column("`id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> systemId = column("`system_id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> levelOneId = column("`level_one_id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> levelTwoId = column("`level_two_id`", JDBCType.INTEGER);

        public final SqlColumn<Integer> state = column("`state`", JDBCType.INTEGER);

        public final SqlColumn<String> supportLanguage = column("`support_language`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> songNumber = column("`song_number`", JDBCType.INTEGER);

        public SongTable() {
            super("`m_song`", SongTable::new);
        }
    }
}