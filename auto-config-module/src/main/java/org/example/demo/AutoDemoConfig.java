package org.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liyunfei
 **/
@ConfigurationProperties(prefix = "test")
public class AutoDemoConfig {

    private String val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
