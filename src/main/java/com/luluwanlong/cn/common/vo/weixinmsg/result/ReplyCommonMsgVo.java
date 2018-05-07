package com.luluwanlong.cn.common.vo.weixinmsg.result;

import com.luluwanlong.cn.common.vo.AbstractVo;

/**
 * @Description: 图片消息/语音消息
 * @Author: zhoulong
 * @Date: 2018/5/5 15:32
 */

public class ReplyCommonMsgVo extends AbstractVo {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private Integer CreateTime;
    //消息类型，event
    private String MsgType;
    //通过素材管理中的接口上传多媒体文件，得到的id。
    private String MediaId;

    public ReplyCommonMsgVo() {
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

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
