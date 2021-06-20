package ua.kordyukov.music.generator;

public class ThreadKick extends  Thread{
    Kick kick = new Kick();
    public void run(){
        kick.PlayKick();
    }
}
