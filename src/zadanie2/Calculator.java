package zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {
        String fileName = "Kalkulator.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(1 + 2 + "\n");
            fileWriter.write(2 + 2 + "\n");
            fileWriter.write(3 - 1 + "\n");
            fileWriter.write(2 * 4 + "\n");

        } catch (IOException e) {
            System.out.println("Problem z zapisem pliku");
        } finally {
            if (fileWriter == null) {
                System.out.println("Problem z zapisem pliku");
            } else {
                fileWriter.close();
            }
        }

        //Odczyt
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bf.readLine();
                if (linia != null) {
                    System.out.println("Wynik: " + linia);
                }
            } while (linia != null);
        } catch (IOException e) {
            System.out.println("Problem z dostepem do pliku");
        } finally {
            bf.close();
        }
    }
}
