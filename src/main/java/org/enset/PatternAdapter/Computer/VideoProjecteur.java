package org.enset.PatternAdapter.Computer;

import java.sql.SQLOutput;

public class VideoProjecteur implements VGA{
    private VGA vga;
    @Override
    public void afficher(String mwssage) {
        System.out.println("Displaying message on video projector: " + mwssage);
        System.out.println(mwssage);
        System.out.println("Projecting message...");
    }

}
