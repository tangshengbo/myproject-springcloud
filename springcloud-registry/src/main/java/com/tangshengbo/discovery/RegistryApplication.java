package com.tangshengbo.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Tang on 2017/7/19.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

    private static Logger logger = LoggerFactory.getLogger(RegistryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
        logger.info("============= RegistryApplication Start Success =============");
    }
}
