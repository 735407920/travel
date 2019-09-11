package com.jk.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.api.service.TravelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("travel")
public class TravelController {
    @Reference(timeout = 500000)
    private TravelService travelService;

    @RequestMapping("findCount")
    @ResponseBody
    public Integer findCount(){
        return travelService.findCount();
    }

}
