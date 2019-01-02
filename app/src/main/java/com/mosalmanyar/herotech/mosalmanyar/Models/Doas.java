package com.mosalmanyar.herotech.mosalmanyar.Models;

import java.io.Serializable;

public class Doas {
  private   String title;
  private   String  num;


    public Doas(String title,String num ) {
        this.title = title;
        this.num = num;

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}

