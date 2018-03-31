package com.kangaroo.ru;

//Расположение всех корпусов

import com.badlogic.gdx.graphics.Texture;

public class Body {

    // текстуры(объекты), которые будут находится в игре...
    private Texture colorTexture;
    private Texture frameTexture;

    //Уже созданные хар-ки, расположения и Размеры корпуса "Волкодав"
    public void bodyWolfhound(){
        colorTexture = new Texture("body_1_color.png");
        frameTexture = new Texture ("body_1_frame.png");

    }

}
