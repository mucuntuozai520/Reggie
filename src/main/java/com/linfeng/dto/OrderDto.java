package com.linfeng.dto;

import com.linfeng.entity.OrderDetail;
import com.linfeng.entity.Orders;
import lombok.Data;
import java.util.List;

/**
 * @author LJM
 * @create 2022/5/3
 */
@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}