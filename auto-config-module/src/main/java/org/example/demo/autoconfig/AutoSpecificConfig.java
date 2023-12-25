package org.example.demo.autoconfig;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liyunfei
 **/

//@Configuration
public class AutoSpecificConfig {

    @Value("${auto.config.specific.hello}")
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
