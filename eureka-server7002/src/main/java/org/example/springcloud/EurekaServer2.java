package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author silentLolex
 * @create 2022/3/14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2.class, args);
    }
}
