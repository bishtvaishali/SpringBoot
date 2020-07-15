package com.vish;

import com.vish.Entity.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext ApplicationContext =  SpringApplication.run(Main.class, args);

        //spring uses singleton pattern
        Alien alien = ApplicationContext.getBean(Alien.class);
        alien.show();
//        Alien alienObj = ApplicationContext.getBean(Alien.class);
//        alienObj.show();


    }
}
