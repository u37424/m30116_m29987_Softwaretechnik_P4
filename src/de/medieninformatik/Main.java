package de.medieninformatik;

public class Main {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Cooling cooling = new Cooling();

        TempSensor sensor = new TempSensor(heater,cooling);

        sensor.setTemperatur(0);
        System.out.println();
        sensor.setTemperatur(-20);
        System.out.println();
        sensor.setTemperatur(60);
        System.out.println();
        sensor.setTemperatur(20);
    }
}
