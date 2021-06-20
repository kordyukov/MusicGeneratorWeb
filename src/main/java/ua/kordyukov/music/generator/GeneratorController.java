package ua.kordyukov.music.generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.kordyukov.music.generator.Bass;

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


    @GetMapping("/Start")
    public String GeneratorHello() {
        threadKick.start();
        threadSnare.start();
        threadHat.start();
        threadBass.start();
        //threadGuitar.start();
        threaGuitarRythm.start();

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
                    Hat hat = new Hat(1);
                    Snare snare = new Snare(1);
                    break;
                case "D":
                    Bass bass1 = new Bass(2);
                    Guitar guitar1 = new Guitar(2);
                    Hat hat1 = new Hat(2);
                    Snare snare1 = new Snare(2);
                    break;
                case "D_sharp":
                    Bass bass2 = new Bass(3);
                    Guitar guitar2 = new Guitar(3);
                    Hat hat2 = new Hat(3);
                    Snare snare2 = new Snare(3);
                    break;
                case "E":
                    Bass bass3 = new Bass(4);
                    Guitar guitar3 = new Guitar(4);
                    Hat hat3 = new Hat(4);
                    Snare snare3 = new Snare(4);
                    break;
                case "F":
                    Bass bass4 = new Bass(5);
                    Guitar guitar4 = new Guitar(5);
                    Hat hat4 = new Hat(5);
                    Snare snare4 = new Snare(5);
                    break;
                case "F_sharp":
                    Bass bass5 = new Bass(6);
                    Guitar guitar5 = new Guitar(6);
                    Hat hat5 = new Hat(6);
                    Snare snare5 = new Snare(6);
                    break;
                case  "G":
                    Bass bass6 = new Bass(7);
                    Guitar guitar6 = new Guitar(7);
                    Hat hat6 = new Hat(7);
                    Snare snare6 = new Snare(7);
                    break;
                case  "G_sharp":
                    Bass bass7 = new Bass(8);
                    Guitar guitar7 = new Guitar(8);
                    Hat hat7 = new Hat(8);
                    Snare snare7 = new Snare(8);
                    break;
                case "A":
                    Bass bass8 = new Bass(9);
                    Guitar guitar8 = new Guitar(9);
                    Hat hat8 = new Hat(9);
                    Snare snare8 = new Snare(9);
                    break;
                case "A_sharp":
                    Bass bass9 = new Bass(10);
                    Guitar guitar9 = new Guitar(10);
                    Hat hat9 = new Hat(10);
                    Snare snare9 = new Snare(10);
                    break;
                case "H":
                    Bass bass10 = new Bass(11);
                    Guitar guitar10 = new Guitar(11);
                    Hat hat10 = new Hat(11);
                    Snare snare10 = new Snare(11);
                    break;

                case  "Am_sharp":
                    Bass bass11 = new Bass(1);
                    Guitar guitar11 = new Guitar(1);
                    Hat hat11 = new Hat(1);
                    Snare snare11 = new Snare(1);
                    break;
                case "Hm":
                    Bass bass12 = new Bass(2);
                    Guitar guitar12 = new Guitar(2);
                    Hat hat12 = new Hat(2);
                    Snare snare12 = new Snare(2);
                    break;
                case "Cm":
                    Bass bass13 = new Bass(3);
                    Guitar guitar13 = new Guitar(3);
                    Hat hat13 = new Hat(3);
                    Snare snare13 = new Snare(3);
                    break;
                case "Cm_sharp":
                    Bass bass14 = new Bass(4);
                    Guitar guitar14 = new Guitar(4);
                    Hat hat14 = new Hat(4);
                    Snare snare14 = new Snare(4);
                    break;
                case "Dm":
                    Bass bass15 = new Bass(5);
                    Guitar guitar15 = new Guitar(5);
                    Hat hat15 = new Hat(5);
                    Snare snare15 = new Snare(5);
                    break;
                case "Dm_sharp":
                    Bass bass16 = new Bass(6);
                    Guitar guitar16 = new Guitar(6);
                    Hat hat16 = new Hat(6);
                    Snare snare16 = new Snare(6);
                    break;
                case  "Em":
                    Bass bass17 = new Bass(7);
                    Guitar guitar17 = new Guitar(7);
                    Hat hat17 = new Hat(7);
                    Snare snare17 = new Snare(7);
                    break;
                case  "Fm":
                    Bass bass18 = new Bass(8);
                    Guitar guitar18 = new Guitar(8);
                    Hat hat18 = new Hat(8);
                    Snare snare18 = new Snare(8);
                    break;
                case "Fm_sharp":
                    Bass bass19 = new Bass(9);
                    Guitar guitar19 = new Guitar(9);
                    Hat hat19 = new Hat(9);
                    Snare snare19 = new Snare(9);
                    break;
                case "Gm":
                    Bass bass20 = new Bass(10);
                    Guitar guitar20 = new Guitar(10);
                    Hat hat20 = new Hat(10);
                    Snare snare20 = new Snare(10);
                    break;
                case "Gm_sharp":
                    Bass bass21 = new Bass(11);
                    Guitar guitar21 = new Guitar(11);
                    Hat hat21 = new Hat(11);
                    Snare snare21 = new Snare(11);
                    break;
                case "C":
                    Bass bass22 = new Bass(0);
                    Guitar guitar22 = new Guitar(0);
                    Hat hat22 = new Hat(0);
                    Snare snare22 = new Snare(0);
                    break;
                case "Am":
                    Bass bass23 = new Bass(0);
                    Guitar guitar23 = new Guitar(0);
                    Hat hat23 = new Hat(0);
                    Snare snare23 = new Snare(0);
                    break;


                default:
                    Bass bass24 = new Bass(0);
                    Guitar guitar24 = new Guitar(0);
                    Hat hat24 = new Hat(0);
                    Snare snare24 = new Snare(0);
            }
            return "MusicGenerator/garmonic";
        }
    }


}
