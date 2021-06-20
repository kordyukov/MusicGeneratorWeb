package ua.kordyukov.music.generator;

public class ThreadSnare extends Thread{
    Snare snare = new Snare();
    public void run(){
        snare.PlaySnare();
    }
}
