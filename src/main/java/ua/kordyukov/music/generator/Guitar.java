package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Guitar implements Runnable {

  private int volume = 90;
  private int chanel = 6;
  private int guitar = 1;
  static private int note = 36;
  private int rytm = 25;

  RandomRythm rythmGuitar = new RandomRythm();
  RandomNotesGuitar randomNotesGuitar = new RandomNotesGuitar();
    public Guitar(){

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

    public int getGuitar() {
        return guitar;
    }

    public void setGuitar(int guitar) {
        this.guitar = guitar;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = randomNotesGuitar.RandomNotes();
    }

    public int getRytm() {
        return rytm;
    }

    public void setRytm(int rytm) {
        this.rytm = rythmGuitar.RythmGuitar();
    }

    public Guitar(int ton){
        this.note += ton;

    }


    public void PlayGuitar(){
        while (true){

                            try {
                                Synthesizer synth = MidiSystem.getSynthesizer();
                                synth.open();
                                MidiChannel[] channels = synth.getChannels();
                                channels[chanel].programChange(guitar);
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

    public void run(){
        this.PlayGuitar();
    }




}
