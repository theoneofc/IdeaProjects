package cn.edu.springboot.config;

import cn.edu.springboot.component.LoginHandlerInterceptor;
import cn.edu.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//
//    }
//}
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //首页视图映射
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        //重定向1 重定向视图映射
        registry.addViewController("/main.html").setViewName("dashboard");
    }
    //登录检查3 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")//"/**"表示任意路径，然后再来排除不需要拦截的就好了
//        .excludePathPatterns("/index.html","/","/index","/user/login");//三个登录页视图映射和LoginController里面的登录请求路径不能拦
        .excludePathPatterns("/index.html","/","/index","/user/login","/asserts/**","/webjars/**");//三个登录页视图映射和LoginController里面的登录请求路径不能拦
//没有css排版等，所以要引入静态资源路径，应该是2.*改版了
// "/asserts/**"(或者"/static/**"也可),"/webjars/**"（这个也要加，因为之前你用了webjars的bootstrap好像）
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}