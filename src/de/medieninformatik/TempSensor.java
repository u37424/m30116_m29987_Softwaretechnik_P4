package de.medieninformatik;
/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 *
 * This class extends the functionality of a Basic Observable Object.<br>
 * The Sensor has an observable Temperature. New Temperatures can be set manually.
 */
public class TempSensor extends Beobachtbar {
    private int temp;

    public TempSensor() {
        super();
        System.out.println("\u001B[32mThermostat eingeschaltet bei " + temp + " Grad.");
    }

    /**
     * Sets the new Value of the Temperature.
     * @param temp New Temperature.
     */
    public void setTemperatur(int temp) {
        this.temp = temp;
        notifyAllListeners(temp);
    }

}
