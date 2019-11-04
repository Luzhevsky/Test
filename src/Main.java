import interface_win.SimpleWindows;
import seaBattle.*;
import inheritance.*;
import Music.*;
import java.util.Date;

class Main {

    public static void main(String args[]) {

        MusicTest music = new MusicTest();

        System.out.println(args.length);
        if(args.length < 2){
            System.out.println("Не забудьте аргументы для инструментов и ноды");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            music.play(instrument, note);
        }

    }
}
