package Heizung;

import Beobachter.TempObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Beobachtbarer{

    private Integer temp;
    private List<TempObserver> tempObservers = new ArrayList<>();

    public void addTempObserver (TempObserver tempObserver){
        this.tempObservers.add(tempObserver);
    }

    public void removeTempObserver (TempObserver tempObserver){
        this.tempObservers.remove(tempObserver);
    }

    public void setTemp(int temp) {
        this.temp=temp;
        for (TempObserver tempObserver : this.tempObservers) {
            tempObserver.update(this.temp);
        }
    }
}
