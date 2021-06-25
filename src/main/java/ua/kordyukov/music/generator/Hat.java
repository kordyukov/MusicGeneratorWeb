package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Hat {
    private int volume = 70;
    private int chanel = 9;
    private int hat = 42;
    static private int note = 42;
    private int rytm = 100;
    RandomRythm rythmDrums = new RandomRythm();

    public Hat(){

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public int getHat() {
        return hat;
    }

    public void setHat(int hat) {
        this.hat = hat;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getRytm() {
        return rytm;
    }

    public void setRytm(int rytm) {
        this.rytm = rythmDrums.RythmHat();
    }

    public   Hat(int ton){
        this.note += ton;

    }


    public void PlayHat(){
        while (true){
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[chanel].programChange(hat);
                channels[chanel].noteOn(note, volume);
                this.setRytm(rytm);
                Thread.sleep(rytm); // in milliseconds
                channels[chanel].noteOff(note);
                synth.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
