package org.example.intergration.listener;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.AnnotatedElement;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 分发事件至对应的监听器。。
 * @author liyunfei
 **/
@Component
public class RegisterDispatcher implements ApplicationListener<ApplicationEvent>, ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    private Set<EventChangedListener> eventChangedListenerSet;

    private Map<String,EventChangedListener> listenerMap = new ConcurrentHashMap<>(16);

    public RegisterDispatcher() {
        System.out.println("contrustor");
    }

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

       //
        // applicationContext.getBeansOfType(EventChangedListener.class).values();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Collection<EventChangedListener> changedListeners = applicationContext.getBeansOfType(EventChangedListener.class).values();
        System.out.println("Init EventChangedListener >>>");
        changedListeners.forEach(eventChangedListener -> {
            System.out.println(eventChangedListener.getType());
        });

//        AnnotatedElement annotatedElement;
//        AnnotatedElementUtils.findMergedAnnotation()
    }
}

