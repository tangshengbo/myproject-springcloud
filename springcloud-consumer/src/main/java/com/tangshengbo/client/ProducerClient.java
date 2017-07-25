package com.tangshengbo.client;

import com.tangshengbo.client.fallback.ProducerFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Tang on 2017/7/19.
 */
@FeignClient(name = "producer", fallbackFactory = ProducerFallbackFactory.class)
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, path = "/producer/currentDateTime")
    String getDateInstance();

    @RequestMapping(method = RequestMethod.GET, path = "/producer/week/{currentDate}")
    int getWeek(@PathVariable("currentDate") String currentDate);

    @RequestMapping(method = RequestMethod.GET, path = "/producer/port")
    String getServerPort(@RequestParam("name") String name);
}
