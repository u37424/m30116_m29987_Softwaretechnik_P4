package de.medieninformatik;

public class TempSensor extends Beobachtbar<Integer> {
    private int temp;

    public TempSensor() {
        super();
        System.out.println("\u001B[32mThermostat eingeschaltet bei " + temp + " Grad.\n");
    }

    public void setTemperatur(int temp) {
        if (temp == this.temp) return;
        this.temp = temp;
        notifyAllListeners(temp);
        System.out.println();
    }

}
