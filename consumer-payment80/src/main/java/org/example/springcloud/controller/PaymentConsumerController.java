package org.example.springcloud.controller;

import org.example.springcloud.entities.CommonResult;
import org.example.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: SilentLolex
 * @Date: 2022/3/14 0:24
 */

@RestController
@RequestMapping("/payment")
public class PaymentConsumerController {

    private final String GET_URL = "http://localhost:8001/payment/provider/get/";
    private final String POST_URL = "http://localhost:8001/payment/provider/create";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(GET_URL + id, CommonResult.class);
    }

    @PostMapping("/consumer/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(POST_URL, payment, CommonResult.class);
    }
}
