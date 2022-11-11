package de.medieninformatik;

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
