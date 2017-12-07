package com.yxy.business.Entity;

import java.util.ArrayList;

public class Tanzhen {

    private String id;
    private String mmac;
    private String rate;
    private String wssid;
    private String wmac;
    private String time;
    private String lat;
    private String lon;
    private String addr;
    private ArrayList<Data> data;

    public Tanzhen() {

    }

    public Tanzhen(String id, String mmac, String rate, String wssid, String wmac, String time, String lat, String lon, String addr, ArrayList<Data> data) {
        this.id = id;
        this.mmac = mmac;
        this.rate = rate;
        this.wssid = wssid;
        this.wmac = wmac;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
        this.addr = addr;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMmac() {
        return mmac;
    }

    public void setMmac(String mmac) {
        this.mmac = mmac;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getWssid() {
        return wssid;
    }

    public void setWssid(String wssid) {
        this.wssid = wssid;
    }

    public String getWmac() {
        return wmac;
    }

    public void setWmac(String wmac) {
        this.wmac = wmac;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}
