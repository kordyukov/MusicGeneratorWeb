package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class GuitarRythm implements Runnable {

    private int volume = 65;
    private int chanel = 6;
    private int guitar = 25;
    Bass note = new Bass();
    RandomNotesGuitar randomNotesGuitar = new RandomNotesGuitar();



    public void PlayGuitarRythm()  {
        while (true) {
            try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            channels[chanel].programChange(guitar);

            channels[chanel].noteOn(note.getNote(), volume);
                channels[chanel].noteOn(randomNotesGuitar.RandomNotes(), volume);

            Thread.sleep(note.getRytm()); // in milliseconds
            channels[chanel].noteOff(note.getNote());
                channels[chanel].noteOff(randomNotesGuitar.RandomNotes());
            synth.close();
            } catch (Exception e) {
                e.printStackTrace();
            }



            }
        }



    public void run(){

            this.PlayGuitarRythm();

    }
}
