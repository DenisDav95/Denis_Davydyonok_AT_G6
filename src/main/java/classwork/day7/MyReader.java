package classwork.day7;

import java.io.*;

public class MyReader {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"));
        out.write("весло было мокрое");
        out.close();



    }


    public int myyy(){
        return 5;
    }
}
