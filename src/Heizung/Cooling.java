package Heizung;

import Beobachter.TempObserver;

import java.util.Observable;
import java.util.Observer;

public class Cooling implements TempObserver{
    private final int MAX_TEMP = 40;
    private boolean isCoolerOn;

    public void update(Object Temp) {
        changeTemp((int)Temp);
    }

    public void changeTemp(int newTemp) {
        if (newTemp > MAX_TEMP && !isCoolerOn) {
            turnCoolingOn();
        } else if (newTemp <= MAX_TEMP && isCoolerOn) {
            turnCoolingOff();
        }
    }

    private void turnCoolingOff() {
        isCoolerOn = false;
        System.out.println("Kuehlung ausgeschaltet.");
    }

    private void turnCoolingOn() {
        isCoolerOn = true;
        System.out.println("Kuehlung eingeschaltet.");
    }
}