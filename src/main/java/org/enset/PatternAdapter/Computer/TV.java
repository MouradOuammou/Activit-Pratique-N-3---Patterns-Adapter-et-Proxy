package org.enset.PatternAdapter.Computer;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("*************************HDMI TV*************************");
        String message = new String(data);
        System.out.println(message);
        System.out.println("Displaying message on TV: " + message);
    }
}
