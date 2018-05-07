package com.luluwanlong.cn.common.vo.weixinmsg.result;

import com.luluwanlong.cn.common.vo.AbstractVo;

/**
 * @Description: 图片消息/语音消息/视频消息
 * @Author: zhoulong
 * @Date: 2018/5/5 15:32
 */

public class ReplyMusicMsgVo extends AbstractVo {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private Integer CreateTime;
    //消息类型，event
    private String MsgType;
    //通过素材管理中的接口上传多媒体文件，得到的id。
    private String ThumbMediaId;
    //音乐标题
    private String Title;
    //音乐描述
    private String Description;
    //音乐链接
    private String MusicURL;
    //高质量音乐链接，WIFI环境优先使用该链接播放音乐
    private String HQMusicUrl;

    public ReplyMusicMsgVo() {
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }

    public String getMusicURL() {
        return MusicURL;
    }

    public void setMusicURL(String musicURL) {
        MusicURL = musicURL;
    }

    public String getHQMusicUrl() {
        return HQMusicUrl;
    }

    public void setHQMusicUrl(String HQMusicUrl) {
        this.HQMusicUrl = HQMusicUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
