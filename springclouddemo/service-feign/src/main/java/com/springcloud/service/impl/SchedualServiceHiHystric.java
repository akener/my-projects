package com.springcloud.service.impl;

import com.springcloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lw on 2018/10/18.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry " + name + "the erueka-client not start!";
    }
}
