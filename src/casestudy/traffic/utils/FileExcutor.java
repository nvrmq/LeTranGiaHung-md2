package casestudy.traffic.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileExcutor {
    private static final String filePath = "/Users/macbook/Desktop/md2/untitled/src/casestudy/traffic/datas/";

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
    public static void writeFile(String fileName, String data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + fileName))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.printf("Error writing to file: %s\n", e.getMessage());
        }
    }
    public static void overwriteFile(String fileName, List<String> lines) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + fileName))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.printf("Error writing to file: %s\n", e.getMessage());
        }
    }
}
