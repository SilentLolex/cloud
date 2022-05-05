package org.example.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;

import java.util.List;

/**
 * @author silentLolex
 * @create 2022/4/28
 */
public interface CloudService {
    List<Payment> getList(String id);
}
