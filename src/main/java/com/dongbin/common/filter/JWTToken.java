package com.dongbin.common.filter;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by dongbin on 2018/4/16.
 */
public class JWTToken implements AuthenticationToken {
    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
