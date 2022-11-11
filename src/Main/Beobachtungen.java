package Main;

import Beobachter.TemperaturSensor;
import Heizung.Beobachtbarer;
import Heizung.Cooling;
import Heizung.Heater;

public class Beobachtungen {
    public static void main(String[] args) {
        Beobachtbarer bb = new Beobachtbarer();
        bb.addObserver(new TemperaturSensor());
        bb.addObserver(new Cooling());
        bb.addObserver(new Heater());

        bb.setTemp(20);
        bb.setTemp(50);
        bb.setTemp(33);
        bb.setTemp(25);
        bb.setTemp(-20);
        bb.setTemp(273);
        bb.setTemp(-273);
    }
}
