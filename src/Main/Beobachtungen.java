package Main;

import Beobachter.Beobachter;
import Heizung.Beobachtbarer;

import java.util.Arrays;

public class Beobachtungen {
    public static void main(String[] args) {
        Beobachter beobachter = new Beobachter();
        Beobachtbarer bb = new Beobachtbarer();
        bb.addObserver(beobachter);

        bb.setTemp(20);
        bb.setTemp(50);
        bb.setTemp(33);
        bb.setTemp(25);
        bb.setTemp(-20);
        bb.setTemp(273);
        bb.setTemp(-273);
    }
}
