package de.medieninformatik;

public class Heater implements Beobachter<Integer>{
    private final int MIN_TEMP = -10;
    private boolean isHeaterOn;

    public void changeTemp(int newTemp){
        if(newTemp < MIN_TEMP && !isHeaterOn){
            turnHeaterOn();
        } else if (newTemp >= MIN_TEMP && isHeaterOn){
            turnHeaterOff();
        }
    }

    public void turnHeaterOn(){
        isHeaterOn = true;
        System.out.println("\033[0;91mHeizung eingeschaltet");
    }

    public void turnHeaterOff(){
        isHeaterOn = false;
        System.out.println("\033[0;91mHeizung ausgeschaltet");
    }

    @Override
    public void changed(Integer wert) {
        changeTemp(wert);
    }
}
