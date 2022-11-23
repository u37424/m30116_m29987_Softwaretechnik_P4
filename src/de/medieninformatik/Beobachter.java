package de.medieninformatik;

/**
 * @param <T> Observable Value / Object.
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 *
 * This Interface can be used for rudimentary observation of a Value / Object.<br>
 * Observers using this interface can be notified by an Observable, that the Value has changed.
 */
public interface Beobachter<T> {

    /**
     * The method is called, when the observed Value changes.
     *
     * @param wert New Value.
     */
    public void changed(T wert);
}
