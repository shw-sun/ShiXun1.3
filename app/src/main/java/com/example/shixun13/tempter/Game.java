package com.example.shixun13.tempter;

public abstract class Game {
    abstract void inilialize();
    abstract void startGame();
    abstract void endGame();

    public void play(){
        inilialize();
        startGame();
        endGame();
    }
}
