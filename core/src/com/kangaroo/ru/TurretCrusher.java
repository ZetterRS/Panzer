package com.kangaroo.ru;


import com.badlogic.gdx.graphics.Texture;

import java.awt.Rectangle;

public class TurretCrusher {

    private Texture colorTexture;
    private Texture frameTexture;
    Rectangle crusher;

    int height, width;

    void texture () {
        colorTexture = new Texture("m54_color.png");
        frameTexture = new Texture("m54_frame.png");

        crusher.height = 231;
        crusher.width = 78;
    }
}
