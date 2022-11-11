package de.medieninformatik;

public interface Beobachter<T> {
    public void changed(T wert);
}
