package org.enset.PatternAdapter.Computer;

public class UniteCentre {
    private VGA vga;

    public void print(String message){
        System.out.println("UniteCentre: printing message...");
        vga.afficher(message);
        System.out.println("UniteCentre: message printed.");
    }
    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
