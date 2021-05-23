package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑超
 * @date 2021-05-23 16:35
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RandomRule_ZY();// 每个微服务调用五次再轮询
    }

}
