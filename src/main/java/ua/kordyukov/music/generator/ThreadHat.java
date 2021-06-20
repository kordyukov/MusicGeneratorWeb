package ua.kordyukov.music.generator;

public class ThreadHat extends Thread {
    Hat hat = new Hat();
   public void run(){
        hat.PlayHat();
    }

}
