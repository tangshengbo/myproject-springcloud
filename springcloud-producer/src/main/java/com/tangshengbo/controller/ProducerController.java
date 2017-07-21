package com.tangshengbo.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Tang on 2017/7/19.
 */
@RestController("/producer")
public class ProducerController {

    private static Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @GetMapping("/currentDateTime")
    public String getDateInstance() {
        logger.info("ProducerController.............currentDateTime");
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\tproducer";
    }

    @RequestMapping(value = "/week/{currentDate}", method = RequestMethod.GET)
    public int getWeek(@PathVariable String currentDate) {
        logger.info("ProducerController.............getWeek");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(format.parse(currentDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

}
