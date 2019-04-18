package com.example.basicprogram.dao;

import com.example.basicprogram.pojo.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author qiyongliang
 * @date 2019/4/10-11:25
 */

@Repository
public interface CustomerMapper {
    /**
     * 查询客户详情
     * @param lUserId
     * @return
     */
    Customer queryCustomerById(long lUserId);
}
