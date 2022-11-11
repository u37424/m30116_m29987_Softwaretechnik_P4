package de.medieninformatik;

public class TempViewer implements Beobachter<Integer> {
    private int temp;

    @Override
    public void changed(Integer wert) {
        if (wert == temp) return;
        temp = wert;
        System.out.println("\033[4;32m\033[1;92mViewer meldet " + temp + " Grad.");
    }
}
