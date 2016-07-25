package com.tothenew.controller;

import com.tothenew.service.HomeService;
import com.tothenew.service.OtherService;
import com.tothenew.log.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Loggable
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Autowired
    private OtherService otherService;

    @RequestMapping(value = "/t1")
    public String home1() throws Exception {
        homeService.add(2, 3);
        homeService.multiply(2, 3);

        otherService.add(2, 3);
        otherService.multiply(2, 3);


        return "1234";
    }

    @RequestMapping(value = "/t2")
    public String home2() throws Exception {

        homeService.add(2, 3);
        homeService.multiply(2, 3);

        otherService.add(2, 3);
        otherService.multiply(2, 3);

        return "ABCD";
    }


}
