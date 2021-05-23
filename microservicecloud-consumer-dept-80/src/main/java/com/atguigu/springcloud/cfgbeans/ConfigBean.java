package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
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

    // 指定随机算法替代ribbon负载均衡的默认轮询算法
    @Bean
    public IRule myRule() {
        return new RandomRule();
//        return new RetryRule();
    }

}
