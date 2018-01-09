package com.yxy.business.controller;

import com.google.gson.Gson;
import com.yxy.business.entity.Data;
import com.yxy.business.entity.Tanzhen;
import com.yxy.business.service.TzService;
import com.yxy.business.utils.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Iterator;

@RestController
public class TanzhenController {

    @Autowired
    private TzService tzService;

    @RequestMapping(value = "/mac", method = RequestMethod.POST)
    public void getData(@RequestBody String data) throws IOException {

        data = UrlUtil.getURLDecoderString(data);
        data = data.substring(5);

        Gson gson = new Gson();
        Tanzhen tanzhen = gson.fromJson(data, Tanzhen.class);
        Iterator<Data> iterator = tanzhen.getData().iterator();
        Data tmp;
        int i = 1;

        System.out.println(tanzhen.getTime());

        while (iterator.hasNext()) {
            tmp = iterator.next();
            //tzService.addData(tanzhen.getTime(), tmp.getMac());
            System.out.println("设备" + i++);

            System.out.println("mac: " + tmp.getMac());
//            System.out.println("rssi: " + tmp.getRssi());
//            System.out.println("ts: " + tmp.getTs());
//            System.out.println("tmc: " + tmp.getTmc());
//            System.out.println("tc: " + tmp.getTc());
//            System.out.println("ds: " + tmp.getDs());
//            System.out.println("e0: " + tmp.getEssid0());
//            System.out.println("e1: " + tmp.getEssid1());
//            System.out.println("e2: " + tmp.getEssid2());
//            System.out.println("e3: " + tmp.getEssid3());
//            System.out.println("e4: " + tmp.getEssid4());
//            System.out.println("e5: " + tmp.getEssid5());
//            System.out.println("e6: " + tmp.getEssid6());
            System.out.println("---------------------------");
        }

    }

}
