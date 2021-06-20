package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Snare {
    private int volume = 80;
    private int chanel = 9;
    private int snare = 38;
    private int note = 48;
    private int rytm = 200;
    RandomRythm rythmDrums = new RandomRythm();

    public  Snare(){

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

    public int getSnare() {
        return snare;
    }

    public void setSnare(int snare) {
        this.snare = snare;
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
        this.rytm = rythmDrums.RythmSnare();
    }

    public Snare(int ton){
        this.note += ton;

    }


    public void PlaySnare(){
        while (true){
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[chanel].programChange(snare);
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
