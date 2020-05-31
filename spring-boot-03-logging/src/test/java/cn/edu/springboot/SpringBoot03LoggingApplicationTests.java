package cn.edu.springboot;

import org.junit.jupiter.api.Test;
/*
问题: 编译运行提示"不兼容的类型: java.lang.String无法转换为java.util.function.Supplier<java.lang.String>"
原因：IDEA自动导入的包有问题
https://www.cnblogs.com/chengshuai5421/p/12286829.html
 */
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {
    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        //System.out.println();

        //日志的级别；
        //由低到高   trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");


    }
}
