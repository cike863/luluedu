package com.luluwanlong.cn.common.constant;

/**
 * @Description: 事件推送
 * @Author: zhoulong
 * @Date: 2018/5/5 15:16
 */

public class EventTypeConstant {
    //MsgType
    private final String EVENT_MSG_TYPE="event";
    //关注后的事件推送
    private final String EVENT_TYPE_SUBSCRIBE="subscribe";
    //用户已关注时的事件推送
    private final String Event_TYPE_SCAN="SCAN";
    //上报地理位置事件
    private final String Event_TYPE_LOCATION="LOCATION";
    //自定义菜单事件--点击菜单拉取消息时的事件推送
    private final String Event_TYPE_CLICK="CLICK";
    //自定义菜单事件--点击菜单跳转链接时的事件推送
    private final String Event_TYPE_VIEW="VIEW";



}
