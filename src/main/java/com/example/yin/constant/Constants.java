package com.example.yin.constant;

public class Constants {
    /* 歌曲图片，歌手图片，歌曲文件，歌单图片等文件的存放路径 */
//    目前资源的本地存放路径
    public static String ASSETS_PATH = System.getProperty("os.name").toLowerCase().startsWith("win") ? "D:\\Music\\music-website-master\\music-server" : "";
    //    用户头像图片
    public static String AVATOR_IMAGES_PATH = "file:" + ASSETS_PATH + "/img/avatorImages/";
    //    歌单图片
    public static String SONGLIST_PIC_PATH = "file:" + ASSETS_PATH + "/img/songListPic/";
    //    歌曲图片
    public static String SONG_PIC_PATH = "file:" + ASSETS_PATH + "/img/songPic/";
    //    歌曲音频
    public static String SONG_PATH = "file:" + ASSETS_PATH + "/song/";
    //    歌手图片
    public static String SINGER_PIC_PATH = "file:" + ASSETS_PATH + "/img/singerPic/";
    //    轮播图
    public static String BANNER_PIC_PATH = "file:" + ASSETS_PATH + "/img/swiper/";


    /* 盐值加密 */
    public static String SALT = "Salt value encryption 663927";
}
