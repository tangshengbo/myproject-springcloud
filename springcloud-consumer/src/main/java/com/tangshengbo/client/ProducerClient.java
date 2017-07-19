package com.tangshengbo.client;

import com.tangshengbo.client.fallback.ProducerFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tang on 2017/7/19.
 */
@FeignClient(name = "producer", fallbackFactory = ProducerFallbackFactory.class)
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, path = "currentDateTime")
    String getDateInstance();
}
