package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyunfei
 **/
@Configuration
@EnableConfigurationProperties(AutoDemoConfig.class)
public class AutoTestConfiguration {

    @Autowired
    private AutoDemoConfig autoDemoConfig;

    @Bean
    public IService iService(){
        System.out.println("httpRegisterManager started");
        return new DemoServiceImpl(autoDemoConfig.getVal());
    }
}
