package com.stjh.springcloud.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.stjh.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zlk
 * @Description:
 * @date 2020/5/39:22
 */
@RestController
@RequestMapping("consumer")
public class OrderController extends ApiController {
    public static final String PAYMENT_URL="http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;  //ApplicationContextConfig配置类

    @GetMapping("/payment/create")
    public R create(Payment payment){
        return success(restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,R.class));
    }

    @GetMapping("/payment/getPage")
    public R selectAll(){
        return success(restTemplate.getForObject(PAYMENT_URL+"/payment/getPage",R.class));
    }

    @GetMapping("/payment/get/{id}")
    public R selectOne(@PathVariable("id") String id){
        return success(restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,R.class));
    }
}
