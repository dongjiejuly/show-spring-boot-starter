package com.yanzige.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 因为该starter需要提供给他项目使用，所以当前项目里面所有的bean对象都需要被扫描到，所有需要设置正确的@ComponentScan的目录
 */
@ComponentScan("com.yanzige.starter")
/**
 * 通过配置文件(OnProperty)的配置项mvc.interceptor.show来激活当前编写的starter功能
 * matchIfMissing = false 如果没有配置则不进行激活
 */
@ConditionalOnProperty(name = "mvc.interceptor.show", matchIfMissing = false)
public class ShowInfoAutoConfig {

    /**
     * 思路整理
     *  1、只要当前类被加载（需要通过Spring.factories进行该类的加载）
     *  2、该类就会通过扫描路径@ComponentScan("com.yanzige.starter") 加载所有的bean到容器中
     *  3、根据@ConditionalOnProperty(name = "mvc.interceptor.show", matchIfMissing = false)检查配置文件是否满足当前Starter是否启动
     */

}
