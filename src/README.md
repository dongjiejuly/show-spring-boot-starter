# starter开发说明
## 说明

## 步骤
### 编写配置文件类，用于读取配置文件的信息
因为需要读取配置文件，来决定是否开启拦截器内部逻辑，所以先开发配置文件读取类

### 拦截器的定制
通过实现Spring拦截器的接口，完成拦截器中功能的开发

### 拦截器的配置
编写拦截器的配置类 WebConfig，该配置类需要将需要使用到的bean实例注入到容器，并且将自定义拦截器添加到Spring的拦截器中

### 将配置启动类加入spring.factories中
配置starter启动器入口 --resources/META-INF/spring.factories

### 测试

## 总结
编写starter功能的顺序
1、先编写对应配置文件读取的配置类 ShowProperties
2、比那些拦截器需要实现的拦截功能 ShowInfoInterceptor
3、编写拦截器的配置类 WebConfig，该配置类需要将需要使用到的bean实例注入到容器，并且将自定义拦截器添加到Spring的拦截器中
4、因为当前编写Starter功能需要提供给其他项目使用，所以当前Starter中的所有组件需要被正确的扫描到，所以需要需要配置正确的扫描路径，并且需要配置相应starter启动的条件