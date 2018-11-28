package com.example.android.burgereman;



public class botatoList {

    public int botatoImg;
    public String botatoName;
    private String botatoPrice;

    public botatoList(int botatoImg , String botatoName , String botatoPrice){
        this.botatoImg = botatoImg;
        this.botatoName = botatoName;
        this.botatoPrice = botatoPrice;
    }

    public int getBotatoImg() {
        return botatoImg;
    }

    public String getBotatoName() {
        return botatoName;
    }

    public String getBotatoPrice() {
        return botatoPrice;
    }
}

