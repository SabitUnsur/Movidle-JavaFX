package com.example.proje_movidle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageManager {

    public  static void GetImageByMovieID(ImageView imageView,Movie movie){

        var Image = DataSetController.getImageList().stream()
                .filter(image -> image.ImageID.equals(movie.movieID))
                .findFirst();

        try {
            if (Image.isPresent()) {
                ImageEntity imageEntity = Image.get();
                String imageLink = imageEntity.getImageLink();
                javafx.scene.image.Image img_src = new Image(imageLink);
                imageView.setImage(img_src);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
