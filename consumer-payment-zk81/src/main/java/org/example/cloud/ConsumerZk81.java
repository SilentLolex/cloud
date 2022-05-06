package org.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author silentLolex
 * @create 2022/5/7
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZk81 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZk81.class, args);
    }
}
