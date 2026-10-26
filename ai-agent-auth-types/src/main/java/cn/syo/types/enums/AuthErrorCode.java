package cn.syo.types.enums;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author syo
 * @description 认证服务错误码
 * @date 2026-10-26 22:23
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum AuthErrorCode {

    AUTH_FAILED("1001", "用户名或密码错误"),
    TOKEN_INVALID("1002", "登录状态无效，请重新登录"),
    TOKEN_EXPIRED("1003", "登录状态过期，请重新登录"),
    USER_DISABLED("1004", "用户被封禁"),
    TOKEN_MISSING("1005", "缺少登录凭证")
    ;

    private String code;
    private String info;
}
