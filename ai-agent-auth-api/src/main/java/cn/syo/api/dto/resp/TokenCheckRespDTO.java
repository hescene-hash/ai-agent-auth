package cn.syo.api.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author syo
 * @description 网关发来Token验证请求的回复
 * @date 2026-10-26 23:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenCheckRespDTO {
    private Boolean valid;
    private Long userId;
    /**
     * 用户名
     */
    private String username;
     /**
      * jwt id（用于唯一标识一个jwt）
      */
    private String jwi;
    private Long expires;
}
