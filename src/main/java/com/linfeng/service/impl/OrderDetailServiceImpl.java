package com.linfeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linfeng.entity.OrderDetail;
import com.linfeng.mapper.OrderDetailMapper;
import com.linfeng.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}