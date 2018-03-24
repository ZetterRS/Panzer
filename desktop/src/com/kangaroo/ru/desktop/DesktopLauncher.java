package com.kangaroo.ru.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kangaroo.ru.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] args) {
		LwjglApplicationConfiguration conf = new LwjglApplicationConfiguration(); //  Сама конфигурация

		conf.title = "Test";
		conf.width = 1366;  //Ширина экрана
		conf.height = 768;  //Высота экрана
		conf.samples = 0;   // Количество семплов сглаживания. Только для PC/Mac/Linux

		// Вертикальная синхронизация.
		conf.vSyncEnabled = true;

		conf.resizable = false;

		conf.fullscreen = false;//Полноэкранный | Оконный режимы

		new LwjglApplication(new MyGdxGame(), conf); // Передаем конфигурацию

	}
}
