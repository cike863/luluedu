package com.luluwanlong.cn.common.vo.weixinmsg.query;

import com.luluwanlong.cn.common.vo.AbstractVo;

/**
 * @Description: $description$
 * @Author: zhoulong
 * @Date: 2018/5/5 15:32
 */

public class MsgTypeVo extends AbstractVo {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private Integer CreateTime;
    //消息类型，event
    private String MsgType;
    //文本消息  内容
    private String Content;
    //图片消息  图片链接（由系统生成）
    private String PicUrl;
    //语音/图片/视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //语音格式，如amr，speex等
    private String Format;
    //语音识别结果，UTF8编码
    private String Recognition;


    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String ThumbMediaId;


    //地理位置消息---start
    //地理位置维度
    private String  Location_X;
    //地理位置经度
    private String Location_Y;
    //地图缩放大小
    private String Scale;
    //地理位置信息
    private String Label;
    //地理位置消息---end

    //链接消息---start
    //消息标题
    private String Title;
    //消息描述
    private String Description;
    //消息链接
    private String Url;
    //链接消息---end


    //消息id，64位整型
    private Integer MsgId;

    public MsgTypeVo() {
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
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

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Integer getMsgId() {
        return MsgId;
    }

    public void setMsgId(Integer msgId) {
        MsgId = msgId;
    }
}
