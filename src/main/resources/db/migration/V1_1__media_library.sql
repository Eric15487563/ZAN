CREATE TABLE `m_system`
(
    `id`    int NOT NULL AUTO_INCREMENT COMMENT '系统ID',
    `name`  varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '系统名称',
    `time`  datetime                                                     DEFAULT NULL COMMENT '添加时间',
    `state` int                                                          DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='系统表';

CREATE TABLE `m_class`
(
    `id`         int NOT NULL AUTO_INCREMENT COMMENT '分类ID',
    `level_id`   int                                                          DEFAULT '0' COMMENT '关联分类ID',
    `name`       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '分类名称',
    `class_type` int NOT NULL                                                 DEFAULT '0' COMMENT '分类级别',
    `desc`       text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '说明备注',
    `time`       datetime                                                     DEFAULT NULL COMMENT '创建时间',
    `state`      int                                                          DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='分类表';

CREATE TABLE `m_language`
(
    `id`       int NOT NULL AUTO_INCREMENT COMMENT '语言ID',
    `language` varchar(10) DEFAULT NULL COMMENT '语言code',
    `desc`     varchar(45) DEFAULT NULL COMMENT '中文描述',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='语言表';

CREATE TABLE `m_song`
(
    `id`               int NOT NULL AUTO_INCREMENT COMMENT '赞美诗ID',
    `system_id`        int                                     DEFAULT '0' COMMENT '关联系统ID',
    `level_one_id`     int                                     DEFAULT '0' COMMENT '关联一级分类',
    `level_two_id`     int                                     DEFAULT '0' COMMENT '关联二级分类',
    `state`            int                                     DEFAULT '1' COMMENT '状态 1：开启 0：关闭',
    `support_language` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '支持语言',
    `song_number`      int                                     DEFAULT NULL COMMENT '歌曲编码',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗主表';

CREATE TABLE `m_song_accompaniment`
(
    `id`            int NOT NULL AUTO_INCREMENT COMMENT '赞美诗伴奏资源ID',
    `song_id`       int      DEFAULT '0' COMMENT '关联诗歌ID',
    `media_type`    int      DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
    `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_time`   datetime DEFAULT NULL COMMENT '更新时间',
    `file_id`       int      DEFAULT '0' COMMENT '关联文件ID',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗伴奏资源表';

CREATE TABLE `m_song_file`
(
    `id`     int NOT NULL AUTO_INCREMENT COMMENT '文件ID',
    `url`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '文件路径',
    `file_size` double DEFAULT NULL COMMENT '文件大小',
    `suffix` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '文件格式',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗文件表';

CREATE TABLE `m_song_information`
(
    `id`           int NOT NULL AUTO_INCREMENT COMMENT '信息ID',
    `song_id`      int                                                           DEFAULT '0' COMMENT '关联歌曲ID',
    `song_number`  int                                                           DEFAULT '0' COMMENT '歌曲编号',
    `desc`         text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '描述',
    `author`       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '作者',
    `release_time` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '发布时间',
    `theme`        varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '主题风格',
    `music_cover`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '封面地址',
    `language`     int                                                           DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
    `backstory`    text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '背景故事',
    `time`         datetime                                                      DEFAULT NULL COMMENT '添加时间',
    `state`        int                                                           DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
    `name`         varchar(45) COLLATE utf8mb4_general_ci                        DEFAULT NULL COMMENT '歌曲名称',
    `url`          varchar(255) COLLATE utf8mb4_general_ci                       DEFAULT NULL COMMENT '默认歌曲文件',
    `lyric`        text COLLATE utf8mb4_general_ci COMMENT '默认歌词文件',
    `recommend`    int                                                           DEFAULT '0' COMMENT '1 为推荐  0为正常\n12',
    `hot`          int                                                           DEFAULT '0' COMMENT '1 为推荐  0为正常\n9',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗信息表';

CREATE TABLE `m_song_language`
(
    `id`          int NOT NULL AUTO_INCREMENT COMMENT '语言关系ID',
    `song_id`     int DEFAULT NULL COMMENT '歌曲ID',
    `language_id` int DEFAULT NULL COMMENT '语言ID',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='赞美诗语言关系表';

CREATE TABLE `m_song_lyric`
(
    `id`            int NOT NULL AUTO_INCREMENT COMMENT '赞美诗歌词资源ID',
    `song_id`       int NOT NULL COMMENT '歌词关联歌曲ID',
    `lyric`         text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '歌词\n',
    `language`      int      DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
    `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_time`   datetime DEFAULT NULL COMMENT '更新时间',
    `file_id`       int      DEFAULT '0' COMMENT '关联文件ID',
    PRIMARY KEY (`id`),
    UNIQUE KEY `m_song_lyric_song_id_uindex` (`song_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗歌词资源表';

CREATE TABLE `m_song_mv`
(
    `id`            int NOT NULL AUTO_INCREMENT COMMENT '赞美诗资源ID',
    `song_id`       int      DEFAULT '0' COMMENT '关联诗歌ID',
    `language`      int      DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
    `media_type`    int      DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
    `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update`        datetime DEFAULT NULL COMMENT '更新时间',
    `file_id`       int      DEFAULT NULL COMMENT '关联文件ID',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗MV资源表';

CREATE TABLE `m_song_score`
(
    `id`            int NOT NULL AUTO_INCREMENT COMMENT '赞美诗资源ID',
    `song_id`       int      DEFAULT NULL COMMENT '关联诗歌ID',
    `language`      int      DEFAULT NULL COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
    `media_type`    int      DEFAULT NULL COMMENT '媒体类型 1视频 2音频 3图片',
    `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_time`   datetime DEFAULT NULL COMMENT '更新时间',
    `score_type`    int      DEFAULT NULL COMMENT '曲谱类型 1简谱 2五线谱 3吉他谱 4其他曲谱',
    `file_id`       int      DEFAULT NULL COMMENT '关联文件ID',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗曲谱资源表';

CREATE TABLE `m_song_vocal`
(
    `id`            int NOT NULL AUTO_INCREMENT COMMENT '赞美诗声部资源ID',
    `song_id`       int      DEFAULT '0' COMMENT '关联诗歌ID',
    `language`      int      DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
    `voice_step`    int      DEFAULT '0' COMMENT '声部类型 1男高 2男低 3女高 4女低 5合唱 6默认',
    `media_type`    int      DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
    `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_time`   datetime DEFAULT NULL COMMENT '更新时间',
    `file_id`       int      DEFAULT '0' COMMENT '关联文件ID',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗声部资源表';

--  初始化数据
INSERT INTO `m_system`(id, name, time, state)
VALUES (1, '赞美诗', '2023-07-15 19:04:14', 1);

INSERT INTO `m_class`(id, level_id, name, class_type, desc, time, state)
VALUES (1, NULL, '我灵之歌', 1, '我灵之歌', '2023-07-15 08:05:44', 1);

INSERT INTO `m_language`(id, "language", "desc")
VALUES (1, '中文', NULL);

INSERT INTO `m_song_information`(id, song_id, song_number, "desc", author, release_time, theme, music_cover, "language",
                                 backstory, "time", state, name, url, lyric, recommend, hot)
VALUES (1, 1, 1, '感谢我主', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-15 08:12:06', 1, '感谢我主', NULL, NULL, 1, 1),
       (2, 2, 2, '赞美恩典的主', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:15:46', 1, '赞美恩典的主', NULL, NULL,
        1, 1),
       (3, 3, 3, '哦，我主', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:16:08', 1, '哦，我主', NULL, NULL, 1, 1),
       (4, 4, 4, '我要称颂耶和华', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:17:09', 1, '我要称颂耶和华', NULL,
        NULL, 1, 1),
       (5, 5, 5, '无法诉说的喜悦', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:17:36', 1, '无法诉说的喜悦', NULL,
        NULL, 1, 1),
       (6, 6, 6, '主恩典是天上大光', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:21', 1, '主恩典是天上大光',
        NULL, NULL, 1, 1),
       (7, 7, 7, '耶稣是我生命', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:22', 1, '耶稣是我生命', NULL, NULL,
        1, 1),
       (8, 8, 8, '我灵魂赞美耶和华', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:23', 1, '我灵魂赞美耶和华',
        NULL, NULL, 1, 1),
       (9, 9, 9, '献上感谢', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:23', 1, '献上感谢', NULL, NULL, 1, 1),
       (10, 10, 10, '我的灵赞美主', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:25', 1, '我的灵赞美主', NULL,
        NULL, 1, 0),
       (11, 11, 11, '与主同在的人', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:25', 1, '与主同在的人', NULL,
        NULL, 1, 0),
       (12, 12, 12, '主耶稣被钉各各他', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:26', 1, '主耶稣被钉各各他',
        NULL, NULL, 1, 0),
       (13, 13, 13, '颂扬主', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-21 11:18:26', 1, '颂扬主', NULL, NULL, 0, 0),
       (14, 14, 1, '新编1', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-24 10:56:12', 1, '新编1', NULL, NULL, 0, 0),
       (15, 15, 2, '新编2', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-24 10:56:48', 1, '新编2', NULL, NULL, 0, 0),
       (16, 16, 3, '新编3', NULL, NULL, NULL, NULL, 1, NULL, '2023-07-24 10:57:01', 1, '新编3', NULL, NULL, 0, 0);

INSERT INTO `m_song`(id, system_id, level_one_id, level_two_id, state, support_language, song_number)
VALUES (1, 1, 1, 0, 1, '1', 1),
       (2, 1, 1, 0, 1, '1', 2),
       (3, 1, 1, 0, 1, '1', 3),
       (4, 1, 1, 0, 1, '1', 4),
       (5, 1, 1, 0, 1, '1', 5),
       (6, 1, 1, 0, 1, '1', 6),
       (7, 1, 1, 0, 1, '1', 7),
       (8, 1, 1, 0, 1, '1', 8),
       (9, 1, 1, 0, 1, '1', 9),
       (10, 1, 1, 0, 1, '1', 10),
       (11, 1, 1, 0, 1, '1', 11),
       (12, 1, 1, 0, 1, '1', 12),
       (13, 1, 1, 0, 1, '1', 13),
       (14, 1, 2, 0, 1, '1', 1),
       (15, 1, 2, 0, 1, '1', 2),
       (16, 1, 2, 0, 1, '1', 3);
INSERT INTO `m_song_file`
VALUES (1, '', NULL, NULL);
