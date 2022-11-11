package Main;

import Beobachter.TempSensor;
import Heizung.Cooling;
import Heizung.Heater;

public class Program {
    public static void main (String[] args) {
        Heater heater = new Heater() ;
        Cooling cooler = new Cooling () ;
        TempSensor sensor = new TempSensor ();
        sensor.setTemperatur (0);
        System.out.println ();
        sensor.setTemperatur (-20);
        System.out.println ();
        sensor.setTemperatur (60);
        System.out.println();
        sensor.setTemperatur (20);
    }
}
