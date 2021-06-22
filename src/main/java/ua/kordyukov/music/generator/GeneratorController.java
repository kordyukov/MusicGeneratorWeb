package ua.kordyukov.music.generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.kordyukov.music.generator.Bass;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/MusicGenerator")
public class GeneratorController {


    ThreadKick threadKick = new ThreadKick();
    ThreadSnare threadSnare = new ThreadSnare();
    ThreadHat threadHat = new ThreadHat();
    ThreadBass threadBass = new ThreadBass();

     Guitar guitar = new Guitar();
     Thread threadGuitar = new Thread(guitar);

    GuitarRythm guitarRythm = new GuitarRythm();
    Thread threaGuitarRythm = new Thread(guitarRythm);

    Pad pad = new Pad();
    Thread threadPad = new Thread(pad);


    @GetMapping("/Start")
    public String GeneratorHello() {


        threadKick.start();
        threadSnare.start();
        threadHat.start();
        threadBass.start();
        threadGuitar.start();
        threadGuitar.suspend();
        threaGuitarRythm.start();
        threadPad.start();


        return "MusicGenerator/Start";

    }

    @GetMapping("/garmonic")
    public String garmonic_D(@RequestParam(value = "ton",required = false)String ton,
                             Model model) {

        while (true) {
        model.addAttribute("ton", ton);

            switch (ton) {
                case  "C_sharp":
                    Bass bass = new Bass(1);
                    Guitar guitar = new Guitar(1);

                    break;
                case "D":
                    Bass bass1 = new Bass(2);
                    Guitar guitar1 = new Guitar(2);

                    break;
                case "D_sharp":
                    Bass bass2 = new Bass(3);
                    Guitar guitar2 = new Guitar(3);

                    break;
                case "E":
                    Bass bass3 = new Bass(4);
                    Guitar guitar3 = new Guitar(4);

                    break;
                case "F":
                    Bass bass4 = new Bass(5);
                    Guitar guitar4 = new Guitar(5);

                    break;
                case "F_sharp":
                    Bass bass5 = new Bass(6);
                    Guitar guitar5 = new Guitar(6);

                    break;
                case  "G":
                    Bass bass6 = new Bass(7);
                    Guitar guitar6 = new Guitar(7);

                    break;
                case  "G_sharp":
                    Bass bass7 = new Bass(8);
                    Guitar guitar7 = new Guitar(8);

                    break;
                case "A":
                    Bass bass8 = new Bass(9);
                    Guitar guitar8 = new Guitar(9);

                    break;
                case "A_sharp":
                    Bass bass9 = new Bass(10);
                    Guitar guitar9 = new Guitar(10);

                    break;
                case "H":
                    Bass bass10 = new Bass(11);
                    Guitar guitar10 = new Guitar(11);

                    break;

                case  "Am_sharp":
                    Bass bass11 = new Bass(1);
                    Guitar guitar11 = new Guitar(1);

                    break;
                case "Hm":
                    Bass bass12 = new Bass(2);
                    Guitar guitar12 = new Guitar(2);

                    break;
                case "Cm":
                    Bass bass13 = new Bass(3);
                    Guitar guitar13 = new Guitar(3);

                    break;
                case "Cm_sharp":
                    Bass bass14 = new Bass(4);
                    Guitar guitar14 = new Guitar(4);

                    break;
                case "Dm":
                    Bass bass15 = new Bass(5);
                    Guitar guitar15 = new Guitar(5);

                    break;
                case "Dm_sharp":
                    Bass bass16 = new Bass(6);
                    Guitar guitar16 = new Guitar(6);

                    break;
                case  "Em":
                    Bass bass17 = new Bass(7);
                    Guitar guitar17 = new Guitar(7);

                    break;
                case  "Fm":
                    Bass bass18 = new Bass(8);
                    Guitar guitar18 = new Guitar(8);

                    break;
                case "Fm_sharp":
                    Bass bass19 = new Bass(9);
                    Guitar guitar19 = new Guitar(9);

                    break;
                case "Gm":
                    Bass bass20 = new Bass(10);
                    Guitar guitar20 = new Guitar(10);

                    break;
                case "Gm_sharp":
                    Bass bass21 = new Bass(11);
                    Guitar guitar21 = new Guitar(11);

                    break;
                case "C":
                    Bass bass22 = new Bass(0);
                    Guitar guitar22 = new Guitar(0);

                    break;
                case "Am":
                    Bass bass23 = new Bass(0);
                    Guitar guitar23 = new Guitar(0);

                    break;


                default:
                    Bass bass24 = new Bass(0);
                    Guitar guitar24 = new Guitar(0);

            }
            return "MusicGenerator/garmonic";
        }
    }

    @GetMapping("/OnOff")
    public String OnOff(@RequestParam("on")String on,Model model)  {
        model.addAttribute("onof",on);

        switch (on){
            case "Stop" :
                threadGuitar.suspend();
                break;
            case "Start" :
                threadGuitar.resume();
                break;


        }

        return "MusicGenerator/OnOff";
    }


}
