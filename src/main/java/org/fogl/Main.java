package org.fogl;

import org.fogl.automat.DEAAutomat;
import org.fogl.constants.DEAHelpers;

public class Main {

    public static void main(String[] args) {

        System.out.println("Heute programmieren wird einen Automaten");

        // Menü - 1 Manuell, 2 File einlesen

        DEAAutomat.DEA("ab");

        System.out.println(DEAHelpers.ANSI_RED + "Rot" + DEAHelpers.ANSI_RED);
        System.out.println(DEAHelpers.ANSI_YELLOW + "Gelb" + DEAHelpers.ANSI_YELLOW);
        System.out.println(DEAHelpers.ANSI_GREEN + "Grün" + DEAHelpers.ANSI_GREEN);
        System.out.println(DEAHelpers.ANSI_RESET + "Reset" + DEAHelpers.ANSI_RESET);

    }
}
