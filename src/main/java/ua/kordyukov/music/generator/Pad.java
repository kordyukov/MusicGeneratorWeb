package ua.kordyukov.music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Pad implements Runnable {
    private int volume = 55;
    private int chanel = 5;
    private int Pad = 90;
    Bass note = new Bass();
    RandomNotesGuitar randomNotesGuitar = new RandomNotesGuitar();

    public void PlayPad() {
        while (true) {
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[chanel].programChange(Pad);

                channels[chanel].noteOn(note.getNote(), volume);


                Thread.sleep(note.getRytm()); // in milliseconds
                channels[chanel].noteOff(note.getNote());

                synth.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }
public void run(){
        this.PlayPad();
}
}