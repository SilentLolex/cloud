package org.example.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author silentLolex
 * @create 2022/4/26
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "org.example.springcloud.dao.**")
@ComponentScan(basePackages = {"org.example.springcloud.*"})
public class ProviderZk8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderZk8003.class, args);
    }
}
