package org.example.intergration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class TestAppStarter
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(TestAppStarter.class, args);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (int i = 0; i < beanDefinitionNames.length; i++) {
//            System.out.println(beanDefinitionNames[i]);
//        }

    }
}
