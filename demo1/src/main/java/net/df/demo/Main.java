package net.df.demo;

import net.df.demo.bean.HelloBean;
import net.df.demo.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        HelloBean helloBean = applicationContext.getBean(HelloBean.class);
        helloBean.hello();
    }
}
