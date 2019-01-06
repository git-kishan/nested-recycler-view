package com.notebook.cvxt001122.temp5;

public class ImageModel {
    private int imageId;
    private String name;

    public ImageModel(int imageId,String name){
        this.imageId=imageId;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
