package com.linfeng.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.linfeng.entity.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {

    void clean();
}
