package com.tangshengbo.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Tang on 2017/7/19.
 */
@RestController
public class ProducerController {

    private static Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @GetMapping("currentDateTime")
    public String getDateInstance() {
        logger.info("ProducerController.............");
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
