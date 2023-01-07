package org.cloud.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

import java.util.Map;

/**
 * 对象工具类
 *
 * @author ting
 */
public class BeamUtils {
    /**
     * 对象转Map
     *
     * @param t 对象
     * @return Map
     */
    public static <T> Map<?, ?> toMap(T t) {
        return JSONObject.parseObject(toJson(t), Map.class);
    }

    /**
     * 对象转Json
     *
     * @param t 对象
     * @return Json
     */
    public static <T> String toJson(T t) {
        return JSON.toJSONString(t);
    }
}
