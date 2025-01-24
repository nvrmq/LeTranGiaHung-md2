package atest.uitilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileExecutor {
    private static final String filePath = "/Users/macbook/Desktop/md2/untitled/src/atest/data/";

    public static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File not found: %s\n", filePath);
        } catch (IOException e) {
            System.out.printf("Error while reading file: %s\n", filePath);
        }
        return lines;
    }
    public static void writeFile(String data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.printf("Error writing to file: %s\n", e.getMessage());
        }
    }
    public static void overwriteFile(List<String> lines) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.printf("Error writing to file: %s\n", e.getMessage());
        }
    }
}
