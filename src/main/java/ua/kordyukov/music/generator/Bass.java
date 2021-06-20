package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Bass {

    private int volume = 80;
    private int chanel = 6;
    private int bass = 33;
    static private int note = 36;
    static private int rytm = 100;
    RandomRythm rythmBass = new RandomRythm();
    RandomNotes randomNotesBass = new RandomNotes();

    public Bass() {

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
        return bass;
    }

    public void setKick(int kick) {
        this.bass = kick;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = randomNotesBass.RandomNotes();
    }

    public int getRytm() {
        return rytm;
    }

    public void setRytm(int rytm) {
        this.rytm = rythmBass.RythmBass();
    }

    public  Bass(int ton){
        this.note += ton;

    }
    public void PlayBass(){
        while (true){
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[chanel].programChange(bass);
                this.setNote(note);
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
