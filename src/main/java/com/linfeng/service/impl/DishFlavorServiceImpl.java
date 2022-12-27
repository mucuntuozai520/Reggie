package com.linfeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linfeng.entity.DishFlavor;
import com.linfeng.mapper.DishFlavorMapper;
import com.linfeng.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
