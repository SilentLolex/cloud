package org.example.springcloud.controller;

import org.example.springcloud.bean.QueryBean;
import org.example.springcloud.entities.CommonResult;
import org.example.springcloud.entities.Payment;
import org.example.springcloud.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author silentLolex
 * @create 2022/5/5
 */
@RestController
public class TestController {

    @Autowired
    private  CloudService cloudService;

    @RequestMapping("/test/query")
    public CommonResult query(@RequestBody QueryBean queryBean) {
        List<Payment> list = cloudService.getList(queryBean.getId());
        CommonResult<Object> result = new CommonResult<>();
        result.setData(list);
        result.setCode(200);
        result.setMessage("success.");
        return result;
    }
}
