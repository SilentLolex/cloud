package org.example.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;

/**
 * @author silentLolex
 * @create 2022/3/12
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
