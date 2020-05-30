package com.example.shixun13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.shixun13.tempter.CS;
import com.example.shixun13.tempter.FootBall;
import com.example.shixun13.tempter.Game;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //双检索单例模式
//        Singleton.getInstance().fun();
//
//
//        //工厂模式
//        ShapeFactory factory = new ShapeFactory();
//        Shape shape1 = factory.getShape(Contents.CIRCLE);
//        shape1.draw();
//        Shape shape2 = factory.getShape(Contents.RECTANGLE);
//        shape2.draw();
//        Shape shape3 = factory.getShape(Contents.SQUARE);
//        shape3.draw();

        //模板模式
        Game game = new FootBall();
        game.play();

        game=new CS();
        game.play();

//
//        Computer.Builder builder = new Computer.Builder().setName("ASAS")
//                .setColor("赫斯")
//                .setOs("123")
//                .setPrice(1000);
//
//        Log.e("TAG",builder.toString());
    }
}
