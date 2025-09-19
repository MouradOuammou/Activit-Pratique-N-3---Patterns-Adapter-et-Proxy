package org.enset.PatternAdapter;

import org.enset.PatternAdapter.Computer.*;
import org.enset.PatternAdapter.Computer.Adapter.HdmiVgaAdapter;

public class Application {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga( new Ecran());
        uniteCentre.print("************Ecran ********");
        uniteCentre.setVga( new VideoProjecteur());
       HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
         hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.afficher("************TV ********");
        uniteCentre.setVga(new SuperVD());
        uniteCentre.print("************SuperVD ********");
        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVD());
        uniteCentre.setVga(hdmiVgaAdapter1);
    }
}
