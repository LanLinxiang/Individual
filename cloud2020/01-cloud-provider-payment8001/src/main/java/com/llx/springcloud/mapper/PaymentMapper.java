package com.llx.springcloud.mapper;


import com.llx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
