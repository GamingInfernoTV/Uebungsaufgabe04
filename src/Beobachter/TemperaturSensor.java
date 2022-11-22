package Beobachter;

import java.util.Observable;
import java.util.Observer;

public class TemperaturSensor implements TempObserver {

    public void update(Object Temp) {
        System.out.println("Beobachtete Temperatur ist: " + Temp);
    }
}
