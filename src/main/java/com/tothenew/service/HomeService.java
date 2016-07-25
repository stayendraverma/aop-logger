package com.tothenew.service;

import com.tothenew.log.Loggable;
import org.springframework.stereotype.Service;

/**
 * Created by satyendra on 19/7/16.
 */
@Service
@Loggable
public class HomeService {



    @Loggable(result = false)
    public Integer multiply(int a, int b) {
        Integer res = a * b;
        return res;
    }


    public Integer add(int a, int b) {
        Integer res = a + b;
        return res;
    }

}
