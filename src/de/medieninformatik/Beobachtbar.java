package de.medieninformatik;

import java.util.LinkedList;

/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 *
 * A base Class for an observable Value. The Observable knows all of its Observers. <br>
 * It can register new Observers and notify all of a change.
 */
public abstract class Beobachtbar {
    private LinkedList<Beobachter> observers;

    public Beobachtbar() {
        this.observers = new LinkedList<>();
    }

    /**
     * The method is called to notify all Observers, when the Observable has changed.
     * @param value New Value.
     */
    protected <T> void notifyAllListeners(T value) {
        for (Beobachter observer : observers) {
            observer.changed(value);
        }
    }

    /**
     * The method is used by the Observable to register new Obserers.
     * @param observer New Observer.
     */
    public <T> void addListener(Beobachter<T> observer) {
        if (observers.contains(observer)) return;
        observers.add(observer);
    }
}
