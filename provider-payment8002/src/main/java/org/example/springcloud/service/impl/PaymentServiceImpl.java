package org.example.springcloud.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.example.springcloud.dao.PaymentDao;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author silentLolex
 * @create 2022/3/13
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }

    public static void main(String[] args) {
        String u = "500 Internal Server Error: \"{\"error\":{\"code\":\"EXIST_NOT_FOR_SALE\",\"message\":\"存在不可售商品\",\"data\":{\"153\":\"CURRENTLY_NOT_FOR_SALE\"},\"details\":null}}\"";
        String s = u.replaceAll("^[0-9a-zA-Z :\"]*", "").trim();
        String substring = s.substring(0, s.length() - 1);
        System.out.println(substring);
        Map hashMap = JSONObject.parseObject(substring, HashMap.class);
        Map error = (Map)hashMap.get("error");
        String message = (String)error.get("message");
        System.out.println(message);
    }
}
