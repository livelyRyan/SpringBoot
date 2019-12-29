package com.ryan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 设置扫描的包路径，包括servlet、filter、listener
@ServletComponentScan(basePackages = "com.ryan")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    // 如果不设置@ServletComponentScan(basePackages = "com.ryan")中的basePackages，就自己创建bean加入容器中
//    @Bean
//    public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
//        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(), "/s2");
//        bean.setLoadOnStartup(1);
//        return bean;
//    }

}
