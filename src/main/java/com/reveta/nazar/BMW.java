package com.reveta.nazar;

public class BMW  {

    private BMW bmw;

    public BMW() {
        this(new BMW());
        bmw = new BMW();
    }

    public BMW(BMW bmw) {
        this.bmw = bmw;
    }
}
