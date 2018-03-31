package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;



public class TurretPunch {


    private Texture colorTexture;
    private Texture frameTexture;

    int height, width;


    void texture() {
        colorTexture = new Texture("turret_2_color.png");



        frameTexture = new Texture("turret_2_frame.png");

    }
}
