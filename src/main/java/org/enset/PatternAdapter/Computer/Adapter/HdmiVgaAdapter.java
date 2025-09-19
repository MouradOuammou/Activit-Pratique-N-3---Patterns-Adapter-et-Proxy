package org.enset.PatternAdapter.Computer.Adapter;

import org.enset.PatternAdapter.Computer.Hdmi;
import org.enset.PatternAdapter.Computer.VGA;

public class HdmiVgaAdapter implements VGA {
    private Hdmi hdmi;
    @Override

    public void afficher(String message) {
        System.out.println("Adapter converting VGA signal to HDMI signal...");
        byte [] data = message.getBytes();
        hdmi.view(data);
        System.out.println("Adapter finished converting and sending the signal.");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
