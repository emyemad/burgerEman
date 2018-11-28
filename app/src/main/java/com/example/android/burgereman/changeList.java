package com.example.android.burgereman;

public class changeList {

    public int BotatoPhoto;
    public String changeBotato;

    public changeList(int BotatoPhoto,String changeBotato)
    {
        this.BotatoPhoto = BotatoPhoto;
        this.changeBotato = changeBotato;
    }

    public int getBotatoPhoto() {
        return BotatoPhoto;
    }

    public String getChangeBotato() {
        return changeBotato;
    }
}
