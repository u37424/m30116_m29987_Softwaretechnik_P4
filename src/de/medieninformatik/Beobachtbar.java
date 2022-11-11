package de.medieninformatik;

import java.util.LinkedList;

public abstract class Beobachtbar<T> {
    private LinkedList<Beobachter> observers;

    public Beobachtbar() {
        this.observers = new LinkedList<>();
    }

    public void notifyAllListeners(int temp) {
        for (Beobachter observer : observers) {
            observer.changed(temp);
        }
    }

    public <T> void addListener(Beobachter<T> observer) {
        if (observers.contains(observer)) return;
        observers.add(observer);
    }

    public <T> boolean removeListener(Beobachter<T> observer) {
        return false;
    }
}
