package ua.kordyukov.music.generator;

public class RandomNotesGuitar {
    private int notes[] = {36,38,
            40,41,43,45,47,48,50,52,53,55,57,59,
            60,62,64,65,67,69,71,72,74,76,77,79,81,83};
    private int NoteGuitar = 24;
    int i = 0;

    public int RandomNotes()
    {

        int random = 0 + (int) (Math.random() * 1);
        int random1 = 0 + (int) (Math.random() * 1);

        if (random == random1) {
            return this.NoteGuitar = notes[0 + (int) (Math.random() * 27)];
        } else {
            while(i<=random+random1){
                i++;
                return  48;}
            return  57;
        }
        //return 60;
    }


   }

