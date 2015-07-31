package com.denko.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;


//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    @Autowired
    private RecallRepository recallRepository;

//    @RequestMapping("/")
//    public String home() {
//        System.out.println("[START] データベースに接続してデータを取得します。");
//        Page<Configurations> configs = configurationsRepository.findAll(new PageRequest(0, 10));
//        for (Configurations config : configs) {
//            System.out.println(config.getName() + " = " + config.getValue());
//        }
//        System.out.println("[END  ] データベースに接続してデータを取得します。");
//        return "index";
//    }

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
        	Application m = ctx.getBean(Application.class);
            m.sayHello();
        }
//        SpringApplication.run(Application.class, args);
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Application app = ctx.getBean(Application.class);
//        app.sayHello();
        

    }
    public void sayHello (){
        Page<Recall> recalls = recallRepository.findAll(new PageRequest(0, 10));
        for (Recall recall : recalls) {
        	System.out.println (recall.getRecallId());
        	System.out.println (recall.getRecallName());
        	
//            System.out.println(recall.getName() + " = " + config.getValue());
        }
        System.out.println("[END  ] データベースに接続してデータを取得します。");
    	
    }

}