package org.enset.PatternAdapter.Computer;

public class Ecran implements VGA {
    @Override
    public void afficher(String message) {
        System.out.println("Displaying message on screen: " + message);
        System.out.println(message);
    }
}
