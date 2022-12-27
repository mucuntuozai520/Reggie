package com.linfeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linfeng.entity.AddressBook;
import com.linfeng.mapper.AddressBookMapper;
import com.linfeng.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
