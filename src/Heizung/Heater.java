package Heizung;

public class Heater {
    private final int MIN_TEMP = -10;
    private boolean isHeaterOn;

    public void changeTemp(int newTemp) {
        if (newTemp < MIN_TEMP && !isHeaterOn) {
            turnHeaterOn();
        } else if (newTemp >= MIN_TEMP && isHeaterOn) {
            turnHeaterOff();
        }
    }

    private void turnHeaterOff() {
        isHeaterOn = false;
        System.out.println("Heizung ausgeschaltet.");
    }

    private void turnHeaterOn() {
        isHeaterOn = true;
        System.out.println("Heizung eingeschaltet.");
    }
}
