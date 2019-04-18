package com.example.basicprogram.controller;

import com.example.basicprogram.pojo.Customer;
import com.example.basicprogram.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiyongliang
 * @date 2019/4/4-14:19
 */
@RestController
@RequestMapping("/world")
public class HelloWorld {

    @Autowired
    CustomerService customerService;
    @RequestMapping("sayHello/{lUserId}")
    public String sayHello(@PathVariable long lUserId) {
       Customer customer = customerService.queryCustomerById(lUserId);
       return customer.toString();
    }
}
