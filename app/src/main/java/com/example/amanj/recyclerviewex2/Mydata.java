package com.example.amanj.recyclerviewex2;

/**
 * Created by amanj on 4/24/2017.
 */

public class Mydata {
    int imgsrc;
    String description;
    String name;

    public Mydata(int imgsrc, String name, String description)
    {
        this.setImgsrc(imgsrc);
        this.setName(name);
        this.setDescription(description);
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }


    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public int getImgsrc() {
        return imgsrc;
    }
}
