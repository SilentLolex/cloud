package org.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.springcloud.bean.QueryBean;
import org.example.springcloud.entities.Payment;

import java.util.List;

/**
 * @author silentLolex
 * @create 2022/5/5
 */

public interface TestMapper {
    List<Payment> getPayments( QueryBean bean);
}
