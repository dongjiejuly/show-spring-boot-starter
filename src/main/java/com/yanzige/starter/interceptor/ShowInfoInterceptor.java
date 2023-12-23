package com.yanzige.starter.interceptor;

import com.yanzige.starter.prop.ShowProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现Spring的拦截器HandlerInterceptor接口，覆盖相应的方法完成拦截器的过能
 */
public class ShowInfoInterceptor implements HandlerInterceptor {

    /**
     * 将配置文件信息信息通过类注入
     */
    @Autowired
    private ShowProperties showProperties;

    /**
     * 实现拦截器的拦截功能，完成需要增强的功能
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断如果开启拦截功能，则进行相应的处理
        if (showProperties.isShow()) {
            String info = showProperties.getInfo();
            if (StringUtils.hasText(info)) {
                System.out.println(info);
            } else {
                System.out.println("hello java");
            }
        }
        return true;
    }
}
