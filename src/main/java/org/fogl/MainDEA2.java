package org.fogl;

import org.fogl.automat.DEAAutomat;
import org.fogl.automat.DEAAutomat2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class MainDEA2 {

    public static void main(String[] args) throws IOException{

        Path path = Paths.get("src", "main", "resources", "fileDEA2.txt");
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
    }


    private static String displayMenu(Scanner scanner) {

        String choice = null;

        System.out.println("""
                                
                >>> DEA2 - Automat <<<
                                
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
            System.out.println("Bitte geben sie eine Zahlen Kombination (0-9) ein: ");
            userInput = scanner.nextLine().toLowerCase();
        } while (userInput.isEmpty());

        return DEAAutomat2.DEA(userInput);
    }

    private static boolean fileInput(FileReader fileReader, Path path) throws IOException {

        String[] allLinesFromFile = null;

        fileReader.readFile(path);
        allLinesFromFile = fileReader.getAllLines();

        for (var line : allLinesFromFile) {

            System.out.println("Eingabe: " + line);
            DEAAutomat2.DEA(line);
            System.out.println();

        }
        return true;
    }
}



