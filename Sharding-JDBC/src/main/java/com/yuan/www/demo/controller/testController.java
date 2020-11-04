package com.yuan.www.demo.controller;


import com.yuan.www.demo.mapper.ds0Mapper;
import com.yuan.www.demo.mapper.ds1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class testController {

    @Autowired
    private ds0Mapper ds0;

    @Autowired
    private ds1Mapper ds1;

    @RequestMapping("/test1")
    public void test1(){
        Random random = new Random();
        for (long i = 0; i < 30; i++) {
            //
            long abs = Math.abs(random.nextLong());
            Long orderId = ds0.add(String.valueOf(i),abs);
            System.out.println(orderId);
            ds1.add(abs,i);
        }
    }

    @RequestMapping("/test2")
    public String test2(@RequestParam Long orderId){
        return ds0.getAllByOrderId(orderId);
    }

    @RequestMapping("/test3")
    public List<String> test3(){
        return ds0.getAll();
    }


}
