package com.tangshengbo.controller;

import com.tangshengbo.client.ProducerClient;
import org.apache.commons.lang.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Tang on 2017/7/19.
 */
@RestController("/consumer")
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ProducerClient client;

    @GetMapping("/currentDateTime")
    public String getDateInstance() {
        logger.info("ConsumerController.............");
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\tconsumer";
    }

    @GetMapping("/week/{currentDate}")
    public int getWeek(@PathVariable("currentDate") String currentDate) {
       return client.getWeek(currentDate);
    }

}
