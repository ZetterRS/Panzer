package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;

import java.awt.Rectangle;


public class TurretPunch {


    private Texture colorTexture;
    private Texture frameTexture;
    Rectangle punch;

    int height, width;


    public void texture() {
        colorTexture = new Texture("turret_2_color.png");
        frameTexture = new Texture("turret_2_frame.png");

        punch = new Rectangle();

        punch.height = 231;
        punch.width = 78;
    }

}
