package org.example.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.springcloud.entities.CommonResult;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author silentLolex
 * @create 2022/3/13
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/provider/create")
    public CommonResult create(@RequestBody Payment payment) {
        int resultCode = paymentService.create(payment);
        log.info("****插入结果：" + resultCode);

        if (resultCode > 0) {
            return new CommonResult(200, "插入数据成功", resultCode);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping("/provider/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果为：" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功：", payment);
        } else {
            return new CommonResult(444, "查询失败,id:" + id, null);
        }
    }
}
