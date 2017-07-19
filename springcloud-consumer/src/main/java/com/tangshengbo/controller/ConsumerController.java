package com.tangshengbo.controller;

import com.tangshengbo.client.ProducerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang on 2017/7/19.
 */
@RestController
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ProducerClient client;

    @GetMapping("/currentDateTime")
    public String getDateInstance() {
        logger.info("ConsumerController.............");
        return client.getDateInstance();
    }

}
