package org.example.intergration.listener;

import org.example.demo.enums.DataChangeType;
import org.example.intergration.event.ApiDataChangeEvent;
import org.springframework.stereotype.Component;

/**
 * @author liyunfei
 **/
@Component
public class MockApiEventChangedListener implements EventChangedListener<ApiDataChangeEvent, DataChangeType> {

    @Override
    public void onListen(ApiDataChangeEvent event, DataChangeType type) {

    }

    @Override
    public DataChangeType getType() {
        return DataChangeType.API;
    }
}
