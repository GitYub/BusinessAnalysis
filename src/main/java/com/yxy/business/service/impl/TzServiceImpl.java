package com.yxy.business.service.impl;

import com.yxy.business.mapper.TzMapper;
import com.yxy.business.service.TzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TzServiceImpl implements TzService{

    @Autowired
    private TzMapper tzMapper;

    public void addData(String timestamp, String mac) {
        tzMapper.addData(timestamp, mac);
    }
}
