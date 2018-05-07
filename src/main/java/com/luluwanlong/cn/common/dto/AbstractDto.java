package com.luluwanlong.cn.common.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @Description: 统一使用此dto抽象类
 * @Author: zhoulong
 * @Date: 2018/5/5 15:23
 */
public abstract class AbstractDto implements Serializable {
    private static final long serialVersionUID = 7791414686504449277L;

    public AbstractDto() {
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

}
