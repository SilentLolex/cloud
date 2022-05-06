package org.example.cloud.controller;

import org.example.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author silentLolex
 * @create 2022/5/7
 */
@RestController
public class TestController {

    private static final String URL = "http://providerZk/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/query/{id}")
    public CommonResult queryProvider(@PathVariable("id") String id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(URL+"/test/query", CommonResult.class);
        if (forEntity.getStatusCode().value() == HttpStatus.OK.value()) {
            return forEntity.getBody();
        }
        CommonResult result = new CommonResult();
        result.setCode(forEntity.getStatusCode().value());
        result.setMessage(forEntity.getStatusCode().getReasonPhrase());
        result.setData(forEntity.getBody());
        return result;

    }
}
