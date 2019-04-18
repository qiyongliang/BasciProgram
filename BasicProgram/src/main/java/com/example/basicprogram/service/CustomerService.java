package com.example.basicprogram.service;

import com.example.basicprogram.dao.CustomerMapper;
import com.example.basicprogram.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiyongliang
 * @date 2019/4/10-11:24
 */
@Service
public class CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    public Customer queryCustomerById(long lUserId){
       return customerMapper.queryCustomerById(lUserId);
    }
}
