package com.tangshengbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Tang on 2017/7/19.
 */
@SpringBootApplication(scanBasePackages = "com.tangshengbo")
@EnableFeignClients
@EnableWebMvc
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ConsumerApplication {

    private static Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        logger.info("============= ConsumerApplication Start Success =============");
    }
}
