package org.example.demo.autoconfig;

import org.example.demo.DemoServiceImpl;
import org.example.demo.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyunfei
 **/
@Configuration
@EnableConfigurationProperties(AutoPrefixConfig.class)
public class AutoCommonConfig {

    @Autowired
    private AutoPrefixConfig autoPrefixConfig;

    @Autowired
    private AutoSpecificConfig autoSpecificConfig;

    @Bean
    public IService iService(){
        System.out.printf("init iService value is %s \n",autoSpecificConfig.getHello());
        return new DemoServiceImpl(autoPrefixConfig.getVal());
    }

    @Bean
    public AutoSpecificConfig autoSpecificConfig(){
        return new AutoSpecificConfig();
    }


    // 两个角度，class,bean & 缺失或者有
    //@ConditionalOnBean
    //@ConditionalOnMissingBean
}
