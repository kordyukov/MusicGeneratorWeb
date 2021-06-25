package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Kick {
    private int volume = 95;
    private int chanel = 9;
    private int kick = 36;
    static private int note = 36;
    private int rytm = 200;
    RandomRythm rythmDrums = new RandomRythm();

    public Kick(){

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

    public int getKick() {
        return kick;
    }

    public void setKick(int kick) {
        this.kick = kick;
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
        this.rytm = rythmDrums.RythmKick();
    }

    public   Kick(int ton){
        this.note += ton;

    }


    public void PlayKick(){
        while (true){
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[chanel].programChange(kick);
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
