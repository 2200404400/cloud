package org.cloud.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应码
 *
 * @author 22004
 * @date 2022.11.22
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    A200(200, true, "成功"),
    A400(400, false, "失败"),
    A404(404, false, "未找到"),
    A500(500, false, "服务器内部错误"),
    ;

    /**
     * 响应码
     */
    private final int code;
    /**
     * 状态
     */
    private final boolean isSucceed;
    /**
     * 响应消息
     */
    private final String message;

}
