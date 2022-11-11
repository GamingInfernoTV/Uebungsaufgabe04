package Beobachter;

public class TempSensor {
    private int temp;
    private Heater Heater;
    private Cooling Cooling;

    public TemperaturSensor(Heater Heater, Cooling Cooling) {
        this.Heater = Heater;
        this.Cooling = Cooling;
    }

    public void setTemperatur(int temp) {
        this.temp = temp;
        statusMessage();
        Heater.changeTemp(temp);
        Cooling.changeTemp(temp);
    }

    private void statusMessage() {
        System.out.printIn("Sensor meldet " + temp + " Grad.");
    }
}