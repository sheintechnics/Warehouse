package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Метод, который берёт данные из ресурсов меню и
     * преобразует их в пункты меню на экране
     * @param menu - объект класса Menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    /**
     * Получение идентификаторов выбранного пункта меню через разные обработчики,
     * переход в другие Activity
     * @param item - объект класса MenuItem, для работы с конкретным пунктом меню
     */
    public void onAdminMenuClick(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, AdminActivity.class);
        startActivity(intent);
    }
    public void onQrMenuClick(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, QrActivity.class);
        startActivity(intent);
    }
}