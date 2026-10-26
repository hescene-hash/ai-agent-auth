package cn.syo.api.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author syo
 * @description 登录返回DTO
 * @date 2026-10-26 22:38
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRespDTO {
    /**
     * JWT，客户端后续放在 Authorization: Bearer {token}
     */
    private String token;

    /**
     * tokenType 固定返回 Bearer
     */
    private String tokenType;

    /**
     * 过期时间（单位秒），和JWT、Redis中保持一致
     */
    private Long expires;

    /**
     * 用户信息
     */
    private UserInfoDTO userInfoDTO;
}
