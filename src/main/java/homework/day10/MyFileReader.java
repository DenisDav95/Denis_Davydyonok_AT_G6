package homework.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MyFileReader {

    public static void main(String[] args) throws IOException {

        BufferedReader readFile = new BufferedReader(new FileReader("test.txt"));

        List<String> file = new ArrayList<>();
        String subLine;
        while (readFile.ready()) {
            subLine = readFile.readLine();
            file.add(subLine);
        }
        readFile.close();

        System.out.println(file.stream()
                .skip(4)
                .filter(i -> i.startsWith("Date log:"))
                .map(i -> i.substring(0, 20))
                .map(i -> i + " " + new Date())
                .collect(Collectors.joining("<br>")));
    }
}
