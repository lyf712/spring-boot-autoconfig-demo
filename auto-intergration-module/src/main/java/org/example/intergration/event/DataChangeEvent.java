package org.example.intergration.event;

import org.example.demo.enums.DataChangeType;
import org.springframework.context.ApplicationEvent;

/**
 * @author liyunfei
 **/
public class DataChangeEvent extends ApplicationEvent {

    private DataChangeType type;

    public DataChangeEvent(Object source) {
        super(source);
    }

    public DataChangeType getType() {
        return type;
    }

    public void setType(DataChangeType type) {
        this.type = type;
    }
}
