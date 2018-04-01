package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;

import java.awt.Rectangle;


public class BodyWolfhound {

    private Texture colorTexture;
    private Texture frameTexture;
    Rectangle wolfhound;

    int width, height;

    void texture(){
        colorTexture = new Texture("body_1_color.png");
        frameTexture = new Texture ("body_1_frame.png");

        wolfhound.height = 231;
        wolfhound.width = 122;
    }
}
