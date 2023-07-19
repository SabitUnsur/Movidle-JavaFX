package com.example.proje_movidle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class AnimationManager {

    //Butonların gösterimini ve düzenini sağlamak için gerekli sınıf.
    public  static void SetAnimations(Button buttoni0,Button buttoni1,Button buttoni2,Button buttoni3,Button buttoni4,Button buttoni5){
        buttoni0.setTranslateX(-100);
        buttoni1.setTranslateX(-100);
        buttoni2.setTranslateX(-100);
        buttoni3.setTranslateX(100);
        buttoni4.setTranslateX(100);
        buttoni5.setTranslateX(100);

        //Geçiş süreleri ile ilgili kodlar.

        Timeline timeline = new Timeline();
        KeyValue keyValue0 = new KeyValue(buttoni0.translateXProperty(),0);
        KeyValue keyValue1 = new KeyValue(buttoni1.translateXProperty(), 0);
        KeyValue keyValue2 = new KeyValue(buttoni2.translateXProperty(), 0);
        KeyValue keyValue3 = new KeyValue(buttoni3.translateXProperty(), 0);
        KeyValue keyValue4 = new KeyValue(buttoni4.translateXProperty(), 0);
        KeyValue keyValue5 = new KeyValue(buttoni5.translateXProperty(), 0);
        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000),keyValue0, keyValue1, keyValue2, keyValue3, keyValue4, keyValue5);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();

    }

}
