package ua.kordyukov.music.generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RandomNotes {
    private int notes[] = {24, 26, 28, 29,31,33,35,36,38,
                           40,41,43,45,47,48,50,52,53,55,57,59,};
    private int NoteBass = 24;
    int i = 0;
    public int RandomNotes()
    {
        int random = 0 + (int) (Math.random() * 5);
        int random1 = 0 + (int) (Math.random() * 5);

        if (random == random1) {
            return this.NoteBass = notes[0 + (int) (Math.random() * 20)];
        } else {
            while(i<=random+random1){
                i++;
            return  36;}
            return  36;
        }
    }

}
