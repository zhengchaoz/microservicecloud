package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 郑超
 * @date 2021-05-23 9:19
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;

    @PostMapping(value = "/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/list")
    public List<Dept> list() {
        return service.list();
    }

}
