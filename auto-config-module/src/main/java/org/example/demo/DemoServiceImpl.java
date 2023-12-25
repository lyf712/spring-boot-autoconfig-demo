package org.example.demo;

/**
 * @author liyunfei
 **/
public class DemoServiceImpl implements IService{

    private final String val ;

    public DemoServiceImpl(String val) {
        this.val = val;
    }

    @Override
    public void hello() {
        System.out.printf("hello : %s \n", val);
    }
}
