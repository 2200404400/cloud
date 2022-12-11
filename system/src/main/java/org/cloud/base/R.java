package org.cloud.base;

import lombok.Data;
import org.cloud.type.ResponseCodeEnum;
import org.cloud.util.DateUtils;

/**
 * 控制层统一返回类型
 *
 * @author 22004
 * @date 2022.11.22
 */
@Data
public class R<T> {
    /**
     * 编码
     */
    private int code;
    /**
     * 状态
     */
    private boolean isSucceed;
    /**
     * 时间
     */
    private String date;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;


    /**
     * 操作成功时调用
     */
    public static <T> R<T> info() {
        return info(null);
    }

    /**
     * 操作成功时调用，附带数据
     */
    public static <T> R<T> info(T data) {
        R<T> r = new R<>();
        r.setCode(ResponseCodeEnum.A200.getCode());
        r.setSucceed(ResponseCodeEnum.A200.isSucceed());
        r.setDate(DateUtils.getNow(DateUtils.YYYY_MM_DD_HH_MM_SS));
        r.setMessage(ResponseCodeEnum.A200.getMessage());
        r.setData(data);
        return r;
    }

    /**
     * 操作失败时调用
     */
    public static <T> R<T> error(Exception exception) {
        R<T> r = new R<>();
        r.setCode(ResponseCodeEnum.A400.getCode());
        r.setSucceed(ResponseCodeEnum.A400.isSucceed());
        r.setDate(DateUtils.getNow(DateUtils.YYYY_MM_DD_HH_MM_SS));
        r.setMessage(ResponseCodeEnum.A400.getMessage() + "：" + exception.getMessage());
        return r;
    }
}
