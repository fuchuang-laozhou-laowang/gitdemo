package com.Shop;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -2002497013287229095L;
    private int uid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                '}';
    }
}
