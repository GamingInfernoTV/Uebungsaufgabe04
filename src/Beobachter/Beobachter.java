package Beobachter;

import Heizung.Cooling;
import Heizung.Heater;

import java.util.Observable;
import java.util.Observer;

public class Beobachter implements Observer {
    private static int NR = 1;
    private int nr;

    Cooling cooling = new Cooling();
    Heater heater = new Heater();

    public Beobachter() {
        this.nr = Beobachter.NR++;
    }

    public void update(Observable beobachtbarer, Object Temp) {
        System.out.println("Beobachtete Temperatur ist: " + Temp);
        heater.changeTemp((int)Temp);
        cooling.changeTemp((int)Temp);
    }
}
