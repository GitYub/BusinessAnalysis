package com.yxy.business.Controller;

import com.yxy.business.Entity.Tanzhen;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TanzhenController {

    @RequestMapping(value = "/mac", method = RequestMethod.POST)
    public Tanzhen getData(@RequestBody Tanzhen tanzhen) {

        System.out.println(tanzhen.getAddr());
        return tanzhen;

    }

}
