package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Lenovo on 31.03.2018.
 */

public class TurretPunch {


    private Texture colorTexture;
    private Texture frameTexture;

    void texture() {
        colorTexture = new Texture("turret_2_color.png");
        frameTexture = new Texture("turret_2_frame.png");
    }
}
