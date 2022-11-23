package de.medieninformatik;

/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 * <p>
 * The Class observes the Temperature of a Sensor.<br>
 * When it gets an update, the new Temperature is displayed on the Console.
 */
public class TempViewer implements Beobachter<Integer> {
    private int temp;

    /**
     * The method is called, when the observed Temperature changes.
     *
     * @param wert New Value of the Temperature.
     */
    @Override
    public void changed(Integer wert) {
        if (wert == temp) return;
        temp = wert;
        System.out.println("\n\033[4;32m\033[1;92mViewer meldet " + temp + " Grad.");
    }
}
