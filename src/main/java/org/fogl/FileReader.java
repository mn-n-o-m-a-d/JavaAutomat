package org.fogl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileReader {

    private String[] allLines = new String[99];

    public String[] getAllLines() {
        return allLines;
    }

    public boolean readFile(Path path) throws IOException {

        if (Files.exists(path)) {

            this.allLines = Files.readAllLines(path).toArray(new String[0]);

            return true;
        }
        return false;
    }
}
