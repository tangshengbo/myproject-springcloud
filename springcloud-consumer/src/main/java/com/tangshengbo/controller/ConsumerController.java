package com.tangshengbo.controller;

import com.tangshengbo.client.ProducerClient;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//import io.swagger.annotations.ApiOperation;

/**
 * Created by Tang on 2017/7/19.
 */
@RestController
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ProducerClient client;

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(" 测试方法")
    @GetMapping("/currentDateTime")
    public String getDateInstance() {
        logger.info("ConsumerController.............");
//        FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\tconsumer";
        return client.getDateInstance();
    }

    @GetMapping("/week/{currentDate}")
    public int getWeek(@PathVariable("currentDate") String currentDate) {
       return client.getWeek(currentDate);
    }

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String getServerPort(@RequestParam("name") String name) {
        logger.info("getServerPort..................");
        String result;
//      result = restTemplate.getForObject("http://producer/producer/port?name=" + name, String.class);
        result =client.getServerPort(name); //使用feign
        return result;
    }
}
