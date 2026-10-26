package cn.syo.api;

import cn.syo.api.dto.req.LoginReqDTO;
import cn.syo.api.dto.resp.LoginRespDTO;
import cn.syo.api.dto.resp.TokenCheckRespDTO;
import cn.syo.api.dto.resp.UserInfoDTO;
import cn.syo.api.response.Response;

/**
 * @author syo
 * @description 认证服务接口
 * @date 2026-10-26 23:02
 */
public interface IAuthService {

    /**
     * 用户登录
     * @param loginReqDTO 登录表单
     * @return 登录成功返回签发的jwt信息
     */
    Response<LoginRespDTO> login(LoginReqDTO loginReqDTO);

    /**
     * 用户登出
     * @param authorization Bearer token
     * @return void
     */
    Response<Void> logout(String authorization);

    /**
     * 网关检查token是否有效
     * @param authorization Bearer token
     * @return token信息
     */
    Response<TokenCheckRespDTO> checkToken(String authorization);

    /**
     * 查询当前登录用户信息
     * @param authorization Bearer token
     * @return 登录用户信息
     */
    Response<UserInfoDTO> userInfo(String authorization);
}
