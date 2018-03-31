

//Расположение всех башен

package com.kangaroo.ru;

import com.badlogic.gdx.graphics.Texture;

import java.io.ByteArrayOutputStream;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.delay;


public class Turret {
    // текстуры(объекты), которые будут находится в игре...
    private Texture colorTexture;
    private Texture frameTexture;

    ByteArrayOutputStream myservo;
    int pos;

    //Уже созданные хар-ки, расположения и Размеры Башни "Крушитель"
    public void turretCrusher() {
        colorTexture = new Texture("m54_color.png");  //Изображение Цвета Башни
        frameTexture = new Texture("m54_frame.png");  //Изображение контура Башни

        // идет от 0 градусов до 360 градусов с шагом 1 градус
        for (pos = 0; pos < 360; pos += 1) {
            myservo.write(pos);                       // говорить myservo перейти в положение в переменной 'pos'
            delay(15); }                     // ждет 15ms для myservo для достижения положения
        // идет от 360 градусов до 0 градусов
        for (pos = 360; pos >= 1; pos -= 1) {
            myservo.write(pos);
            delay(15);
        }
    }


    //Уже созданные хар-ки, расположения и Размеры Башни "Дырокол"
        public void turretPunch() {
            colorTexture = new Texture("turret_2_color.png");//Изображение Цвета Башни
            frameTexture = new Texture("turret_2_frame.png");//Изображение контура Башни

        }
}
