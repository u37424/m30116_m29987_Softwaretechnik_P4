package de.medieninformatik;

public class TempViewer {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Cooling cooling = new Cooling();

        TempSensor sensor = new TempSensor();
        sensor.addListener(heater);
        sensor.addListener(cooling);

        sensor.setTemperatur(0);
        sensor.setTemperatur(0);
        sensor.setTemperatur(-20);
        sensor.setTemperatur(60);
        sensor.setTemperatur(20);
    }
}
