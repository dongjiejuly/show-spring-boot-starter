package com.yanzige.starter.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 指定配置文件的prefix前缀 mvc.interceptor
@ConfigurationProperties(prefix = "mvc.interceptor")
public class ShowProperties {

    /**
     * 配置文件的配置项 show
     */
    private boolean show = true;

    /**
     * 配置文件的配置项 show
     */
    private String info;

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
