package com.tangshengbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Tang on 2017/7/19.
 */
@SpringBootApplication(scanBasePackages = "com.tangshengbo")
@EnableEurekaClient
@EnableWebMvc
public class ProducerApplication {

    private static Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
        logger.info("============= ProducerApplication Start Success =============");
    }
}
