package com.example.auser.demosendtoserver;

/**
 * Created by auser on 2017/11/27.
 */

public class Data {
    String addr;
    String phone;

    public Data() {
        this ("台北市敦化南路一段","0933156842");

    }

    public Data(String addr, String phone) {
        this.addr = addr;
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
