package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 郑超
 * @date 2021-05-23 9:31
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced// 开启客户端的负载均衡（ribbon）
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
