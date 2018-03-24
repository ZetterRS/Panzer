

//Расположение всех башен

package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;



public class Turret {
// текстуры(объекты), которые будут находится в игре...
    private Texture colorTexture;
    private Texture frameTexture;

    //Уже созданные хар-ки, расположения и Размеры Башни "Крушитель"
        public void turretCrusher(){
            colorTexture = new Texture("m54_color.png");  //Изображение Цвета Башни
            frameTexture = new Texture("m54_frame.png");  //Изображение контура Башни
    }
    //Уже созданные хар-ки, расположения и Размеры Башни "Дырокол"
        public void turretPunch(){
            colorTexture = new Texture("turret_2_color.png");
            frameTexture = new Texture("turret_2_frame.png");
        }
}
