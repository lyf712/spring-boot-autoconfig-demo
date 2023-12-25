package org.example.demo.listener;

/**
 * @author liyunfei
 **/
public interface EventChangedListener <E,T>{
    /**
     *
     * @param event
     * @param type
     */
    void onListen(E event,T type);

    /**
     *
     * @return
     */
    T getType();
}
