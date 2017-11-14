package com.suixingpay.dubboapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource("classpath:consumer-context.xml")
@SpringBootApplication
public class DubboApiApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        SpringApplication.run(DubboApiApplication.class, args);
        @SuppressWarnings("resource")
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer-context.xml");
         StartsDubbo startsDubbo = (StartsDubbo) context.getBean("startsDubbo");
       // Message message = (Message) context.getBean("message");

        //消费
        System.out.println("测试结果：" + startsDubbo.getStart());
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8086);
    }
}
