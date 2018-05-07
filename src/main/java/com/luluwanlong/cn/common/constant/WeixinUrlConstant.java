package com.luluwanlong.cn.common.constant;

/**
 * @Description: weixing url
 * @Author: zhoulong
 * @Date: 2018/5/5 16:20
 */

public class WeixinUrlConstant {
    //&appid=APPID&secret=APPSECRET
    //token
    public final String token = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";

    //获取微信服务器IP地址
    public final String WEIXIN_IP = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=";


    //客服消息--添加客服帐号
    public final String ADD_KFACCOUNT = "https://api.weixin.qq.com/customservice/kfaccount/add?access_token=";
    //客服消息--修改客服帐号
    public final String update_KFACCOUNT = "https://api.weixin.qq.com/customservice/kfaccount/update?access_token=";
    //客服消息--删除客服帐号
    public final String del_KFACCOUNT = "https://api.weixin.qq.com/customservice/kfaccount/del?access_token=";
    //客服消息--设置客服帐号的头像
    public final String uploadheadimg_KFACCOUNT = "https://api.weixin.qq.com/customservice/kfaccount/uploadheadimg?kf_account=KFACCOUNT&access_token=";
    //客服消息--获取所有客服账号
    public final String list_KFACCOUNT = "https://api.weixin.qq.com/cgi-bin/customservice/getkflist?access_token=";
    //客服消息--客服接口-发消息
    public final String send_msg = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
    //客服消息--客服输入状态
    public final String typing_msg = "https://api.weixin.qq.com/cgi-bin/message/custom/typing?access_token=";

}
