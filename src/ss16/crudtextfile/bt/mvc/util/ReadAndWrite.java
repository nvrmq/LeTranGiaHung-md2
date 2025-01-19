package ss16.crudtextfile.bt.mvc.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))){
            for (String s : stringList) {
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) {
            return stringList;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){;
            String line;
            while ((line = reader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}
