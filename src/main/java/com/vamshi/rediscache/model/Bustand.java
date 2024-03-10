package com.vamshi.rediscache.model;

import java.io.Serializable;

public class Bustand implements Serializable {
    int busid;
    String dname;
    String style;

    public Bustand(int busid, String dname, String style) {
        this.busid = busid;
        this.dname = dname;
        this.style = style;
    }

    public Bustand() {

    }

    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
