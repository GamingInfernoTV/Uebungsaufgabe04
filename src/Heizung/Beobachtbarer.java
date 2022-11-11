package Heizung;

import java.util.Observable;

public class Beobachtbarer extends Observable {

    public Beobachtbarer() {
        super();
    }

    public void setTemp(int Temp) {
        super.setChanged();
        super.notifyObservers(Temp);
    }
}
