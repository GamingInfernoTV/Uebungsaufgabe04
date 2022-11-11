package Heizung;

import java.util.Observable;

public class Beobachtbarer extends Observable {
    private int Temp;

    public Beobachtbarer() {
        super();
    }

    public void setTemp(int Temp) {
        this.Temp = Temp;
        super.setChanged(); // Markierung, dass sich der Text geändert hat
        super.notifyObservers(Temp); // ruft für alle Beobachter die update-Methode auf
    }

    public int getTemp() {
        return Temp;
    }
}
