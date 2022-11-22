package Main;

import Beobachter.TemperaturSensor;
import Heizung.Beobachtbarer;
import Heizung.Cooling;
import Heizung.Heater;

/**
 * @author Maximilian Lux <code>m30112</code>
 * @author Aaron Pöhlmann <code>m30115</code>
 */
public class Beobachtungen {
    public static void main(String[] args) {
        Beobachtbarer bb = new Beobachtbarer();
        bb.addTempObserver(new TemperaturSensor());
        bb.addTempObserver(new Cooling());
        bb.addTempObserver(new Heater());

        bb.setTemp(20);
        bb.setTemp(50);
        bb.setTemp(33);
        bb.setTemp(25);
        bb.setTemp(-20);
        bb.setTemp(273);
        bb.setTemp(-273);
    }
}
