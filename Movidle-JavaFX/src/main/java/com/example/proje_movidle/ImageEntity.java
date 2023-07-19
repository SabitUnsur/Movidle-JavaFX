package com.example.proje_movidle;

public class ImageEntity {
    String ImageID;
    String ImageLink;

    public ImageEntity(String imageID, String imageLink) {
        ImageID = imageID;
        ImageLink = imageLink;
    }
    public String getImageLink() {
        return ImageLink;
    }

}
