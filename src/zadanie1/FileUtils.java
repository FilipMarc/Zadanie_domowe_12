package zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {

    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        int lines = 0;

        while (sc.hasNextLine()) {
            lines++;
            sc.nextLine();
        }
        return lines;
    }

    static Employee[] read(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Employee[] result = new Employee[lines];

        for (int i = 0; i < lines; i++) {
            String line = sc.nextLine();
            String[] split = line.split(";");
            double price = Double.parseDouble(split[4]);
            result[i] = new Employee(split[0], split[1],split[2],split[3], price);
        }
        return result;
    }

}
