package ua.kordyukov.music.generator;

public class ThreadBass extends  Thread{
    Bass bass = new Bass();
    public void run(){
        bass.PlayBass();
    }
}
