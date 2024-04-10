package org.fogl;

import org.fogl.automat.DEAAutomat;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException{

        Path path = Paths.get("src", "main", "resources", "uebung04042024.txt");
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReader();
        String choice = null;

        choice = displayMenu(scanner);

        switch (choice) {

            case "1" -> userInput(scanner);
            case "2" -> fileInput(fileReader, path);
            case "9" -> System.out.println("Bis zum nächsten mal!");
            default -> System.out.println("Ungültige Eingabe - Beendet");

        }
        /*
        // Test:
        DEAAutomat.DEA("ab");
        System.out.println(DEAHelpers.ANSI_RED + "Rot" + DEAHelpers.ANSI_RED);
        System.out.println(DEAHelpers.ANSI_YELLOW + "Gelb" + DEAHelpers.ANSI_YELLOW);
        System.out.println(DEAHelpers.ANSI_GREEN + "Grün" + DEAHelpers.ANSI_GREEN);
        System.out.println(DEAHelpers.ANSI_RESET + "Reset" + DEAHelpers.ANSI_RESET);
         */
    }


    private static String displayMenu(Scanner scanner) {

        String choice = null;

        System.out.println("""
                                
                >>> DEA - Automat <<<
                                
                1 - Manuelle Eingabe
                2 - Datei einlesen
                                
                9 - Beenden
                                
                """);

        do {
            System.out.println("Bitte geben sie eine gültige Auswahl ein: ");
            choice = scanner.nextLine();
        } while (!(choice.equals("1") || choice.equals("2") || choice.equals("9")));

        return choice;
    }

    private static boolean userInput(Scanner scanner) {

        String userInput = null;
        do {
            System.out.println("Bitte geben sie eine Buchstaben Kombination mit a, b, c, d ein: ");
            userInput = scanner.nextLine().toLowerCase();
        } while (userInput.isEmpty());

        return DEAAutomat.DEA(userInput);
    }

    private static boolean fileInput(FileReader fileReader, Path path) throws IOException {

        String[] allLinesFromFile = null;

        fileReader.readFile(path);
        allLinesFromFile = fileReader.getAllLines();

        for (var line : allLinesFromFile) {

            System.out.println("Eingabe: " + line);
            DEAAutomat.DEA(line);
            System.out.println();

        }
        return true;
    }
}



