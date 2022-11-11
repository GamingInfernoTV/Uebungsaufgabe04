package Beobachter;

import Heizung.Cooling;
import Heizung.Heater;

public class TempSensor {
    private int temp;
    private Heater heater;
    private Cooling cooling;

    public TempSensor(Heater Heater, Cooling Cooling) {
        this.heater = Heater;
        this.cooling = Cooling;
    }

    public void setTemperatur(int temp) {
        this.temp = temp;
        statusMessage();
        heater.changeTemp(temp);
        cooling.changeTemp(temp);
    }

    private void statusMessage() {
        System.out.println("Sensor meldet " + temp + " Grad.");
    }
}