package de.medieninformatik;

/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 * <p>
 * This is the Cooling class. <br>
 * Within this class, the cooler either activates or deactivates itself depending on the observed Temperature.
 */
public class Cooling implements Beobachter<Integer>{
    private final int MAX_TEMP = 40;
    private boolean isCoolerOn;

    /**
     * This method turns the Cooler on or off, depending on the new Temperature.
     * @param newTemp Current Temperature.
     */
    public void changeTemp(int newTemp){
        if(newTemp > MAX_TEMP && !isCoolerOn){
            turnCoolingOn();
        } else if (newTemp <= MAX_TEMP && isCoolerOn){
            turnCoolingOff();
        }
    }

    /**
     * Turns the Cooler on and gives it out on the console.
     */
    public void turnCoolingOn(){
        isCoolerOn = true;
        System.out.println("\033[0;96mKühlung eingeschaltet");
    }

    /**
     * Turns the Cooler off and gives it out on the console.
     */
    public void turnCoolingOff(){
        isCoolerOn = false;
        System.out.println("\033[0;96mKühlung ausgeschaltet");
    }

    /**
     * The method is called, when the observed Value changes.
     *
     * @param wert New Value.
     */
    @Override
    public void changed(Integer wert) {
        changeTemp(wert);
    }
}
