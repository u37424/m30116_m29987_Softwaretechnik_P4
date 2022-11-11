package de.medieninformatik;

public class TempSensor {
    private int temp;
    private Heater heater;
    private Cooling cooling;

    public TempSensor(Heater heater, Cooling cooling){
        this.heater = heater;
        this.cooling = cooling;
    }

    public void setTemperatur(int temp){
        this.temp = temp;
        statusMessage();
        heater.changeTemp(temp);
        cooling.changeTemp(temp);
    }

    private void statusMessage() {
        System.out.println("Sensor meldet "+ temp + " Grad.");
    }
}
