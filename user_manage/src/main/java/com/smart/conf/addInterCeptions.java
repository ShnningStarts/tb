package com.smart.conf;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.smart.DTO.UserLogginDto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class SessionHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserLogginDto userLoginDto = (UserLogginDto)request.getSession().getAttribute("user");
        if (userLoginDto ==null){
            response.sendRedirect("login.html");
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
