package org.example.springcloud.service.impl;

import org.example.springcloud.bean.QueryBean;
import org.example.springcloud.dao.TestMapper;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author silentLolex
 * @create 2022/4/28
 */
@Service
public class CloudServiceImpl implements CloudService {
    @Autowired
    private TestMapper mapper;

    @Override
    public List<Payment> getList(String id) {
        QueryBean queryBean = new QueryBean();
        queryBean.setId(id);
        return mapper.getPayments(queryBean);
    }
}
