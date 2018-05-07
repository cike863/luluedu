package com.luluwanlong.cn.common.vo.weixinmsg.result;

import com.luluwanlong.cn.common.vo.AbstractVo;

/**
 * @Description: 文本消息
 * @Author: zhoulong
 * @Date: 2018/5/5 15:32
 */

public class ReplyTextMsgVo extends AbstractVo {
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


    public ReplyTextMsgVo() {
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
}
