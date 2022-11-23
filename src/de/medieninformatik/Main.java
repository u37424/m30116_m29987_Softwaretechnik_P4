package de.medieninformatik;
/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 * <p>
 * In this class, the entire program will run.
 * The temperatures will be set here <br>
 * Depending on them, the heater and cooler will activate or deactivate themselves fully.
 */
public class Main {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Cooling cooling = new Cooling();
        TempViewer v = new TempViewer();

        TempSensor sensor = new TempSensor();
        sensor.addListener(v);
        sensor.addListener(heater);
        sensor.addListener(cooling);

        sensor.setTemperatur(0);
        sensor.setTemperatur(0);
        sensor.setTemperatur(-20);
        sensor.setTemperatur(60);
        sensor.setTemperatur(20);
    }
}
