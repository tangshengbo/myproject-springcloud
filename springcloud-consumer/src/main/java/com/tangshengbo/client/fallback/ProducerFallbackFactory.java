package com.tangshengbo.client.fallback;

import com.tangshengbo.client.ProducerClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Tang on 2017/7/19.
 */
@Component
public class ProducerFallbackFactory implements FallbackFactory<ProducerClient>{

    private static Logger logger = LoggerFactory.getLogger(ProducerFallbackFactory.class);

    @Override
    public ProducerClient create(Throwable throwable) {
        final String msg = throwable.getMessage();
        logger.info("create:{}", msg);
        return new ProducerClient() {
            @Override
            public String getDateInstance() {
                return msg;
            }
            @Override
            public int getWeek(String currentDate) {
                return 0;
            }

            @Override
            public String getServerPort(@RequestParam String name) {
                return "8080";
            }
        };
    }
}
