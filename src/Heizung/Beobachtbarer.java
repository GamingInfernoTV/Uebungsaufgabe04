package Heizung;

import java.util.Observable;

public class Beobachtbarer extends Observable {
    private int Temp;

    public Beobachtbarer() {
        super();
    }

    public void setTemp(int Temp) {
        this.Temp = Temp;
        super.setChanged();
        super.notifyObservers(Temp);
    }

    public int getTemp() {
        return Temp;
    }
}
