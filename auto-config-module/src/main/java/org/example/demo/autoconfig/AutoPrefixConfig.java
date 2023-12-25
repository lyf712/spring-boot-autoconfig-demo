package org.example.demo.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liyunfei
 **/
@ConfigurationProperties(prefix = "auto.config.prefix")
public class AutoPrefixConfig {

    private String val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
