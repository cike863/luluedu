package com.luluwanlong.cn.common.vo.weixinmsg.query;

import com.luluwanlong.cn.common.vo.AbstractVo;

/**
 * @Description: 事件推送 vo
 * @Author: zhoulong
 * @Date: 2018/5/5 15:23
 */

public class EventMsgVo extends AbstractVo {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private Integer CreateTime;
    //消息类型，event
    private String MsgType;
    //事件类型，subscribe(订阅)、unsubscribe(取消订阅)
    private String Event;
    //事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String EventKey;
    //二维码的ticket，可用来换取二维码图片
    private String Ticket;
    //地理位置纬度
    private String Latitude;
    //地理位置经度
    private String Longitude;
    //地理位置精度
    private String Precision;

    public EventMsgVo() {
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

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }
}
