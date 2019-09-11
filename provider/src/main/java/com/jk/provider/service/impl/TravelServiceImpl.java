package com.jk.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.api.service.TravelService;
import com.jk.provider.mapper.TravelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelMapper travelMapper;
    @Override
    public Integer findCount() {
        return travelMapper.findCount();
    }
}
