package de.medieninformatik;

public class Cooling implements Beobachter<Integer>{
    private final int MAX_TEMP = 40;
    private boolean isCoolerOn;

    public void changeTemp(int newTemp){
        if(newTemp > MAX_TEMP && !isCoolerOn){
            turnCoolingOn();
        } else if (newTemp <= MAX_TEMP && isCoolerOn){
            turnCoolingOff();
        }
    }

    public void turnCoolingOn(){
        isCoolerOn = true;
        System.out.println("\033[0;96mKühlung eingeschaltet");
    }

    public void turnCoolingOff(){
        isCoolerOn = false;
        System.out.println("\033[0;96mKühlung ausgeschaltet");
    }

    @Override
    public void changed(Integer wert) {
        changeTemp(wert);
    }
}
