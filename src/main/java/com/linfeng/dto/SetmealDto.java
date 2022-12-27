package com.linfeng.dto;


import com.linfeng.entity.Setmeal;
import com.linfeng.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
