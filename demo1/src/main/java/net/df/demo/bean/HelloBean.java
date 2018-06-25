package net.df.demo.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    private Logger logger = LoggerFactory.getLogger(HelloBean.class);
    public void hello(){
        logger.info("hello");
    }
}
