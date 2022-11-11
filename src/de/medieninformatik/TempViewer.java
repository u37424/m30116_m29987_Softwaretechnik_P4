package de.medieninformatik;

public class TempViewer implements Beobachter<Integer> {
    private int temp;

    @Override
    public void changed(Integer wert) {
        if (wert == temp) return;
        temp = wert;
        System.out.println("\u001B[32mViewer meldet " + temp + " Grad.");
    }
}
