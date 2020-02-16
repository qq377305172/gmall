package com.atgui.gmall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GmallEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallEurekaApplication.class, args);
    }

}
