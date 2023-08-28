-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: media_library
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `m_auth_permission`
--

DROP TABLE IF EXISTS `m_auth_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_auth_permission` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(50) NOT NULL COMMENT '权限名称',
  `description` varchar(255) NOT NULL COMMENT '描述',
  `type` varchar(20) NOT NULL COMMENT '权限类型',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_auth_permission`
--

LOCK TABLES `m_auth_permission` WRITE;
/*!40000 ALTER TABLE `m_auth_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_auth_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_auth_role`
--

DROP TABLE IF EXISTS `m_auth_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_auth_role` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(25) NOT NULL COMMENT '角色名称',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_auth_role`
--

LOCK TABLES `m_auth_role` WRITE;
/*!40000 ALTER TABLE `m_auth_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_auth_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_auth_role_permission`
--

DROP TABLE IF EXISTS `m_auth_role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_auth_role_permission` (
  `role_id` int NOT NULL COMMENT '角色ID',
  `permission_id` int NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_auth_role_permission`
--

LOCK TABLES `m_auth_role_permission` WRITE;
/*!40000 ALTER TABLE `m_auth_role_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_auth_role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_auth_user`
--

DROP TABLE IF EXISTS `m_auth_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_auth_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `login_time` datetime NOT NULL COMMENT '最后登录时间',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态：0启用，1禁用',
  `role_id` int NOT NULL DEFAULT '2' COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='后台管理员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_auth_user`
--

LOCK TABLES `m_auth_user` WRITE;
/*!40000 ALTER TABLE `m_auth_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_auth_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_class`
--

DROP TABLE IF EXISTS `m_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_class` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `level_id` int DEFAULT '0' COMMENT '关联分类ID',
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '分类名称',
  `class_type` int NOT NULL DEFAULT '0' COMMENT '分类级别',
  `desc` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '说明备注',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `state` int DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_class_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='分类表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_class`
--

LOCK TABLES `m_class` WRITE;
/*!40000 ALTER TABLE `m_class` DISABLE KEYS */;
INSERT INTO `m_class` VALUES (1,NULL,'我灵之歌',1,'我灵之歌','2023-07-15 08:05:44',1);
/*!40000 ALTER TABLE `m_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_language`
--

DROP TABLE IF EXISTS `m_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_language` (
  `id` int DEFAULT NULL COMMENT '语言ID',
  `language` varchar(10) DEFAULT NULL COMMENT '语言code',
  `desc` varchar(45) DEFAULT NULL COMMENT '中文描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='语言表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_language`
--

LOCK TABLES `m_language` WRITE;
/*!40000 ALTER TABLE `m_language` DISABLE KEYS */;
INSERT INTO `m_language` VALUES (1,'中文',NULL);
/*!40000 ALTER TABLE `m_language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song`
--

DROP TABLE IF EXISTS `m_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song` (
  `id` int NOT NULL COMMENT '赞美诗ID',
  `system_id` int DEFAULT '0' COMMENT '关联系统ID',
  `level_one_id` int DEFAULT '0' COMMENT '关联一级分类',
  `level_two_id` int DEFAULT '0' COMMENT '关联二级分类',
  `state` int DEFAULT '1' COMMENT '状态 1：开启 0：关闭',
  `support_language` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '支持语言',
  `song_number` int DEFAULT NULL COMMENT '歌曲编码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_song_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗主表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song`
--

LOCK TABLES `m_song` WRITE;
/*!40000 ALTER TABLE `m_song` DISABLE KEYS */;
INSERT INTO `m_song` VALUES (1,1,1,0,1,'1',1),(2,1,1,0,1,'1',2),(3,1,1,0,1,'1',3),(4,1,1,0,1,'1',4),(5,1,1,0,1,'1',5),(6,1,1,0,1,'1',6),(7,1,1,0,1,'1',7),(8,1,1,0,1,'1',8),(9,1,1,0,1,'1',9),(10,1,1,0,1,'1',10),(11,1,1,0,1,'1',11),(12,1,1,0,1,'1',12),(13,1,1,0,1,'1',13),(14,1,2,0,1,'1',1),(15,1,2,0,1,'1',2),(16,1,2,0,1,'1',3);
/*!40000 ALTER TABLE `m_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_accompaniment`
--

DROP TABLE IF EXISTS `m_song_accompaniment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_accompaniment` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '赞美诗伴奏资源ID',
  `song_id` int DEFAULT '0' COMMENT '关联诗歌ID',
  `media_type` int DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `file_id` int DEFAULT '0' COMMENT '关联文件ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_song_accompaniment_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗伴奏资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_accompaniment`
--

LOCK TABLES `m_song_accompaniment` WRITE;
/*!40000 ALTER TABLE `m_song_accompaniment` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_accompaniment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_file`
--

DROP TABLE IF EXISTS `m_song_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_file` (
  `id` int DEFAULT NULL COMMENT '文件ID',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '文件路径',
  `file_size` double DEFAULT NULL COMMENT '文件大小',
  `suffix` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '文件格式'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗文件表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_file`
--

LOCK TABLES `m_song_file` WRITE;
/*!40000 ALTER TABLE `m_song_file` DISABLE KEYS */;
INSERT INTO `m_song_file` VALUES (1,'',NULL,NULL);
/*!40000 ALTER TABLE `m_song_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_information`
--

DROP TABLE IF EXISTS `m_song_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_information` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '信息ID',
  `song_id` int DEFAULT '0' COMMENT '关联歌曲ID',
  `song_number` int DEFAULT '0' COMMENT '歌曲编号',
  `desc` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '描述',
  `author` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '作者',
  `release_time` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '发布时间',
  `theme` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '主题风格',
  `music_cover` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '封面地址',
  `language` int DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
  `backstory` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '背景故事',
  `time` datetime DEFAULT NULL COMMENT '添加时间',
  `state` int DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
  `name` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '歌曲名称',
  `url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '默认歌曲文件',
  `lyric` text COLLATE utf8mb4_general_ci COMMENT '默认歌词文件',
  `recommend` int DEFAULT '0' COMMENT '1 为推荐  0为正常\n12',
  `hot` int DEFAULT '0' COMMENT '1 为推荐  0为正常\n9',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_information_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_information`
--

LOCK TABLES `m_song_information` WRITE;
/*!40000 ALTER TABLE `m_song_information` DISABLE KEYS */;
INSERT INTO `m_song_information` VALUES (1,1,1,'感谢我主',NULL,NULL,NULL,NULL,1,NULL,'2023-07-15 08:12:06',1,'感谢我主',NULL,NULL,1,1),(2,2,2,'赞美恩典的主',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:15:46',1,'赞美恩典的主',NULL,NULL,1,1),(3,3,3,'哦，我主',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:16:08',1,'哦，我主',NULL,NULL,1,1),(4,4,4,'我要称颂耶和华',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:17:09',1,'我要称颂耶和华',NULL,NULL,1,1),(5,5,5,'无法诉说的喜悦',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:17:36',1,'无法诉说的喜悦',NULL,NULL,1,1),(6,6,6,'主恩典是天上大光',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:21',1,'主恩典是天上大光',NULL,NULL,1,1),(7,7,7,'耶稣是我生命',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:22',1,'耶稣是我生命',NULL,NULL,1,1),(8,8,8,'我灵魂赞美耶和华',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:23',1,'我灵魂赞美耶和华',NULL,NULL,1,1),(9,9,9,'献上感谢',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:23',1,'献上感谢',NULL,NULL,1,1),(10,10,10,'我的灵赞美主',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:25',1,'我的灵赞美主',NULL,NULL,1,0),(11,11,11,'与主同在的人',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:25',1,'与主同在的人',NULL,NULL,1,0),(12,12,12,'主耶稣被钉各各他',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:26',1,'主耶稣被钉各各他',NULL,NULL,1,0),(13,13,13,'颂扬主',NULL,NULL,NULL,NULL,1,NULL,'2023-07-21 11:18:26',1,'颂扬主',NULL,NULL,0,0),(14,14,1,'新编1',NULL,NULL,NULL,NULL,1,NULL,'2023-07-24 10:56:12',1,'新编1',NULL,NULL,0,0),(15,15,2,'新编2',NULL,NULL,NULL,NULL,1,NULL,'2023-07-24 10:56:48',1,'新编2',NULL,NULL,0,0),(16,16,3,'新编3',NULL,NULL,NULL,NULL,1,NULL,'2023-07-24 10:57:01',1,'新编3',NULL,NULL,0,0);
/*!40000 ALTER TABLE `m_song_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_language`
--

DROP TABLE IF EXISTS `m_song_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_language` (
  `id` int DEFAULT NULL COMMENT '语言关系ID',
  `song_id` int DEFAULT NULL COMMENT '歌曲ID',
  `language_id` int DEFAULT NULL COMMENT '语言ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='赞美诗语言关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_language`
--

LOCK TABLES `m_song_language` WRITE;
/*!40000 ALTER TABLE `m_song_language` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_lyric`
--

DROP TABLE IF EXISTS `m_song_lyric`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_lyric` (
  `id` int NOT NULL COMMENT '赞美诗歌词资源ID',
  `song_id` int NOT NULL AUTO_INCREMENT COMMENT '歌词关联歌曲ID',
  `lyric` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '歌词\n',
  `language` int DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `file_id` int DEFAULT '0' COMMENT '关联文件ID',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `m_song_lyric_song_id_uindex` (`song_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗歌词资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_lyric`
--

LOCK TABLES `m_song_lyric` WRITE;
/*!40000 ALTER TABLE `m_song_lyric` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_lyric` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_mv`
--

DROP TABLE IF EXISTS `m_song_mv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_mv` (
  `id` int DEFAULT '0' COMMENT '赞美诗资源ID',
  `song_id` int DEFAULT '0' COMMENT '关联诗歌ID',
  `language` int DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
  `media_type` int DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update` datetime DEFAULT NULL COMMENT '更新时间',
  `file_id` int DEFAULT NULL COMMENT '关联文件ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗MV资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_mv`
--

LOCK TABLES `m_song_mv` WRITE;
/*!40000 ALTER TABLE `m_song_mv` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_mv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_score`
--

DROP TABLE IF EXISTS `m_song_score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_score` (
  `id` int DEFAULT NULL COMMENT '赞美诗资源ID',
  `song_id` int DEFAULT NULL COMMENT '关联诗歌ID',
  `language` int DEFAULT NULL COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
  `media_type` int DEFAULT NULL COMMENT '媒体类型 1视频 2音频 3图片',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `score_type` int DEFAULT NULL COMMENT '曲谱类型 1简谱 2五线谱 3吉他谱 4其他曲谱',
  `file_id` int DEFAULT NULL COMMENT '关联文件ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗曲谱资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_score`
--

LOCK TABLES `m_song_score` WRITE;
/*!40000 ALTER TABLE `m_song_score` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_song_vocal`
--

DROP TABLE IF EXISTS `m_song_vocal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_song_vocal` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '赞美诗声部资源ID',
  `song_id` int DEFAULT '0' COMMENT '关联诗歌ID',
  `language` int DEFAULT '1' COMMENT '语言类型 1中文 2英文 3韩文 4西班牙 5法文 6俄文 7意大利 8日文 9其他语言',
  `voice_step` int DEFAULT '0' COMMENT '声部类型 1男高 2男低 3女高 4女低 5合唱 6默认',
  `media_type` int DEFAULT '0' COMMENT '媒体类型 1视频 2音频 3图片',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `file_id` int DEFAULT '0' COMMENT '关联文件ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_song_vocal_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='赞美诗声部资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_song_vocal`
--

LOCK TABLES `m_song_vocal` WRITE;
/*!40000 ALTER TABLE `m_song_vocal` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_song_vocal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `m_system`
--

DROP TABLE IF EXISTS `m_system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `m_system` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '系统ID',
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '系统名称',
  `time` datetime DEFAULT NULL COMMENT '添加时间',
  `state` int DEFAULT '1' COMMENT '状态 默认1：开启 0：关闭',
  PRIMARY KEY (`id`),
  UNIQUE KEY `m_system_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='系统表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_system`
--

LOCK TABLES `m_system` WRITE;
/*!40000 ALTER TABLE `m_system` DISABLE KEYS */;
INSERT INTO `m_system` VALUES (1,'赞美诗','2023-07-15 19:04:14',1);
/*!40000 ALTER TABLE `m_system` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-28 15:10:04
