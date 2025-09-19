package org.enset.PatternAdapter.Computer;

import org.enset.PatternAdapter.Computer.Adapter.HdmiVgaAdapter;

public class SuperVD implements VGA , Hdmi {
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("SuperVD Viewing message: ");
        System.out.println(message);
        System.out.println("SuperVD Viewing finished.");
    }

    @Override
    public void afficher(String message) {
        System.out.println("SuperVD Displaying message: ");
        System.out.println(message);
        System.out.println("SuperVD Displaying finished.");
    }
}
