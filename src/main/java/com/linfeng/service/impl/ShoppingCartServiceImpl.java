package com.linfeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linfeng.entity.ShoppingCart;
import com.linfeng.mapper.ShoppingCartMapper;
import com.linfeng.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
