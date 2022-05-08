package com.adidas.email.infrastructure.configuration;

import com.adidas.email.domain.exception.AuthorizationException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityInterceptor implements HandlerInterceptor {

    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String key = "password";


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        if (handler instanceof ResourceHttpRequestHandler
                || "org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)".equals(handler.toString())) {
            return true;
        }

        String authorization = request.getHeader(AUTHORIZATION_HEADER);

        if (!key.equals(authorization)) {
            throw new AuthorizationException();
        }

        return true;
    }

}


