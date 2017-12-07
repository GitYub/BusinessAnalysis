package com.yxy.business.entity;

public class Data {

    private String mac;
    private int rssi;
    private String ts;
    private String tmc;
    private char tc;
    private char ds;
    private String essid0;
    private String essid1;
    private String essid2;
    private String essid3;
    private String essid4;
    private String essid5;
    private String essid6;

    public Data() {

    }

    public Data(String mac, int rssi, String ts, String tmc, char tc, char ds, String essid0, String essid1, String essid2, String essid3, String essid4, String essid5, String essid6) {
        this.mac = mac;
        this.rssi = rssi;
        this.ts = ts;
        this.tmc = tmc;
        this.tc = tc;
        this.ds = ds;
        this.essid0 = essid0;
        this.essid1 = essid1;
        this.essid2 = essid2;
        this.essid3 = essid3;
        this.essid4 = essid4;
        this.essid5 = essid5;
        this.essid6 = essid6;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getTmc() {
        return tmc;
    }

    public void setTmc(String tmc) {
        this.tmc = tmc;
    }

    public char getTc() {
        return tc;
    }

    public void setTc(char tc) {
        this.tc = tc;
    }

    public char getDs() {
        return ds;
    }

    public void setDs(char ds) {
        this.ds = ds;
    }

    public String getEssid0() {
        return essid0;
    }

    public void setEssid0(String essid0) {
        this.essid0 = essid0;
    }

    public String getEssid1() {
        return essid1;
    }

    public void setEssid1(String essid1) {
        this.essid1 = essid1;
    }

    public String getEssid2() {
        return essid2;
    }

    public void setEssid2(String essid2) {
        this.essid2 = essid2;
    }

    public String getEssid3() {
        return essid3;
    }

    public void setEssid3(String essid3) {
        this.essid3 = essid3;
    }

    public String getEssid4() {
        return essid4;
    }

    public void setEssid4(String essid4) {
        this.essid4 = essid4;
    }

    public String getEssid5() {
        return essid5;
    }

    public void setEssid5(String essid5) {
        this.essid5 = essid5;
    }

    public String getEssid6() {
        return essid6;
    }

    public void setEssid6(String essid6) {
        this.essid6 = essid6;
    }
}
