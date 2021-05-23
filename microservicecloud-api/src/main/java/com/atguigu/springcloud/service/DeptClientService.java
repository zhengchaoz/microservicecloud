package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 郑超
 * @date 2021-05-23 17:42
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@RequestMapping("/dept")
public interface DeptClientService {

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/list")
    public List<Dept> list();

    @PostMapping(value = "/add")
    public boolean add(Dept dept);

}
