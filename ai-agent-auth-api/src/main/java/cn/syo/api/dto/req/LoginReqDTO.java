package cn.syo.api.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author syo
 * @description 登录请求DTO
 * @date 2026-10-26 22:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginReqDTO {
    /**
     * 用户名
     */
    @NotBlank(message = "账户名不能为空")
    String username;
    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    String password;
}
