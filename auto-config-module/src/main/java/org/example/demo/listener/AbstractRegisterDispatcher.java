package org.example.demo.listener;

import org.example.demo.event.DataChangeEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 分发事件至对应的监听器。。
 * @author liyunfei
 **/
public abstract class AbstractRegisterDispatcher implements ApplicationListener<ApplicationEvent>, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Set<EventChangedListener> eventChangedListenerSet;

    private Map<String,EventChangedListener> listenerMap = new ConcurrentHashMap<>(16);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//        if(applicationEvent instanceof DataChangeEvent){
//            DataChangeEvent event = (DataChangeEvent) applicationEvent;
//            switch (event.getType()){
//                case API:{
//                    EventChangedListener eventChangedListener = listenerMap.get("");
//                    //eventChangedListener.onListen();
//                }
//            }
//        }

        // 发布事件、获取Bean对象（根据类型OR，class)
       // applicationContext.
    }
}

