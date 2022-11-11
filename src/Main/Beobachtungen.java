package Main;

import Beobachter.Beobachter;
import Heizung.Beobachtbarer;

import java.util.Arrays;

public class Beobachtungen {
    public static void main(String[] args) {
        Beobachter[] bArray = {new Beobachter(), new Beobachter(), new Beobachter()};
        Beobachtbarer bb = new Beobachtbarer();
        for (Beobachter b: Arrays.asList(bArray)) {
            bb.addObserver(b);
        }
        bb.setTemp(1);
        bb.setTemp(2);
        bb.setTemp(3);
    }
}
