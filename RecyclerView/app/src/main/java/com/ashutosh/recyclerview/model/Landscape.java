package com.ashutosh.recyclerview.model;

/*Created by ASHUTOSH on 24-Jan-17.*/


import java.util.ArrayList;

public class Landscape {

    private int imageID;
    private String title;
    private String description;


    public void setImageID(int imageID)
    {
        this.imageID=imageID;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public int getImageID()
    {
        return imageID;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public static ArrayList<Landscape> getData()
    {
        ArrayList<Landscape> dataList = new ArrayList<>();

        int[] images = getImages();

        for (int i=0; i<images.length; i++)
        {
            Landscape landscape = new Landscape();
            landscape.setImageID(images[i]);
            landscape.setTitle("Lacdscape "+i);

            dataList.add(landscape);
        }
        return dataList;
    }

    public static int[] getImages() {

        int[] images=new int[10];
        String temp;
        for (int i=0;i<10;i++)
        {
            temp="R.drawable.thumb_1_"+i;
            images[i]= Integer.parseInt(temp);
        }
        return images;

    }
}
