package Beobachter;

import Heizung.Cooling;
import Heizung.Heater;

import java.util.Observable;
import java.util.Observer;

public class TemperaturSensor implements Observer {

    public void update(Observable beobachtbarer, Object Temp) {
        System.out.println("Beobachtete Temperatur ist: " + Temp);
    }
}
