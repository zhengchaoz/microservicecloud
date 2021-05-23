package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 郑超
 * @date 2021-05-23 9:34
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public Boolean add(Dept dept) {
        return this.service.add(dept);
    }

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list() {
        return this.service.list();
    }

}
