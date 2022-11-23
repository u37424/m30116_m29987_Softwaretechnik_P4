package de.medieninformatik;
/**
 * @author: Sebastian Siebert m30116
 * @author: Luca Spirka m29987
 * <p>
 * This is the heater class. <br>
 * Within this class, the heater either activates or deactivates itself depending on the observed Temperature.
 */
public class Heater implements Beobachter<Integer>{
    private final int MIN_TEMP = -10;
    private boolean isHeaterOn;

    /**
     * This method turns the Heater on or off, depending on the new Temperature.
     * @param newTemp Current Temperature.
     */
    public void changeTemp(int newTemp){
        if(newTemp < MIN_TEMP && !isHeaterOn){
            turnHeaterOn();
        } else if (newTemp >= MIN_TEMP && isHeaterOn){
            turnHeaterOff();
        }
    }

    /**
     * Turns the heater on and gives it out on the console.
     */
    public void turnHeaterOn(){
        isHeaterOn = true;
        System.out.println("\033[0;91mHeizung eingeschaltet");
    }


    /**
     * Turns the heater off and gives it out on the console.
     */
    public void turnHeaterOff(){
        isHeaterOn = false;
        System.out.println("\033[0;91mHeizung ausgeschaltet");
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
