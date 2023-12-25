package org.example.intergration.event;

/**
 * @author liyunfei
 **/
public class ApiDataChangeEvent extends DataChangeEvent {

    private String url;

    // GET,POST,

    private String method;

    public ApiDataChangeEvent(Object source) {
        super(source);
    }
}
