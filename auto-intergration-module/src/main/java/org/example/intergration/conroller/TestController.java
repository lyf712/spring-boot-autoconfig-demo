package org.example.intergration.conroller;

import org.example.demo.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author liyunfei
 **/
@RestController
public class TestController {
    @Autowired
    private IService iService;

    @PostConstruct
    void init(){
        iService.hello();
    }
}
