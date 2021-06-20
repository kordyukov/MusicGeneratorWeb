package ua.kordyukov.music.generator;

public class RandomRythm {
    private int rythmSnare[] = {400, 800, 1400};
    private int rythmKick[] = {400, 800, 1400};
    private int rythmHat[] = {200,400,800};
    private int rythmBass[] = {50,100,200,400,800};
    private int rythmGuitar[] = {100,200,400,800,1400};

    private int indexHat = 100;
    private int indexSnare = 400;
    private int indexKick = 800;
    private int indexBass = 200;
    private int indexGuitar = 100;

    public int RythmKick() {
        int random = 0 + (int) (Math.random() * 100);
        int random1 = 0 + (int) (Math.random() * 100);

        if (random == random1) {
            return this.indexKick = rythmHat[0 + (int) (Math.random() * 2)];
        }
        else {
            return this.indexKick;
        }

    }

    public int RythmSnare() {
        int random = 0 + (int) (Math.random() * 100);
        int random1 = 0 + (int) (Math.random() * 100);

        if (random == random1) {
            return this.indexSnare = rythmHat[0 + (int) (Math.random() * 2)];
        }
        else {
            return this.indexSnare;
        }


    }

    public int RythmHat() {
        int random = 0 + (int) (Math.random() * 100);
        int random1 = 0 + (int) (Math.random() * 100);


        if (random == random1) {
          return this.indexHat = rythmHat[0 + (int) (Math.random() * 2)];
        }
        else {
            return this.indexHat;
        }
    }

    public int RythmBass(){
        int random = 0 + (int) (Math.random() * 100);
        int random1 = 0 + (int) (Math.random() * 100);


        if (random == random1) {
            return this.indexBass = rythmBass[0 + (int) (Math.random() * 4)];
        }
        else {
            return this.indexBass;
        }
    }

    public int RythmGuitar(){
//        int random = 0 + (int) (Math.random() * 1);
//        int random1 = 0 + (int) (Math.random() * 1);


        //if (random == random1) {
            return this.indexGuitar = 25 + ((int) (Math.random() * 800));
//        }
//        else {
//            return this.indexGuitar;
//        }
    }

}
