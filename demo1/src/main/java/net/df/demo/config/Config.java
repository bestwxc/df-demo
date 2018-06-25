package net.df.demo.config;

import net.df.demo.bean.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan("net.df.demo")*/
public class Config {
    @Bean
    HelloBean helloBean(){
        return new HelloBean();
    }
}
