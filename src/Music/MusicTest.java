package Music;
import javax.sound.midi.*;
public class MusicTest {
    public void play(int instrument, int note){
        try {
            Sequencer player = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage firs = new ShortMessage();
            firs.setMessage(192,1,instrument,100);
            MidiEvent changInstrument = new MidiEvent(firs,1);
            track.add(changInstrument);


            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOne = new MidiEvent(a, 1);
            track.add(noteOne);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 1);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
