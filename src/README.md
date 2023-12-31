# starter开发说明
## 说明
该Readme是一个关于如何制作starter项目的说明，该工程有详细的步骤说明，该工程是一个完整的starter工程，要使用该starter只需要在您的项目引入pom依赖即可
，如有版本version变动请自行修改

## 步骤
### 编写配置文件类，用于读取配置文件的信息
因为需要读取配置文件application.yml中配置数据，来决定是否开启拦截器内部逻辑，所以先开发配置文件读取类

### 拦截器的定制
通过实现Spring拦截器的接口HandlerInterceptor，完成拦截器中自定义功能的开发，实现自己的增强功能

### 拦截器的配置
编写拦截器的配置类 WebConfig，该配置类需要将需要使用到的bean实例注入到容器，并且将自定义拦截器添加到Spring的拦截器中

### 将配置启动类加入spring.factories中
配置starter启动器入口 --resources/META-INF/spring.factories

### 测试
代码完成开发，需要使用maven install安装到本地，然后在其他项目中导入pom依赖即可进行验证
```xml
<dependency>
    <groupId>org.yanzige.starter</groupId>
    <artifactId>show-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## 总结
编写starter功能的顺序
- 先编写对应配置文件读取的配置类 ShowProperties
- 实现拦截器需要实现的拦截功能 ShowInfoInterceptor
- 编写拦截器的配置类 WebConfig，该配置类需要将需要使用到的bean实例注入到容器，并且将自定义拦截器添加到Spring的拦截器中
- 因为当前编写Starter功能需要提供给其他项目使用，所以当前Starter中的所有组件需要被正确的扫描到，所以需要需要配置正确的扫描路径，并且需要配置相应starter启动的条件
- 在其他项目只引用pom依赖 + 在配置文件中添加相应的配置以开启starter功能

注：参考总结来源于网络 https://www.bilibili.com/video/BV18X4y1z73R/?spm_id_from=333.337.search-card.all.click&vd_source=5f9e6b35dbb163280676b2a0be0142e9