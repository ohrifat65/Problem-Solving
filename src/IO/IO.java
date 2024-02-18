package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "E:/tutorial/core java bangla/iot.txt";
        File f = new File(path);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        fw.write("Obaydul Hossain Rifat Khand");
        fw.close();

        FileReader rd = new FileReader(path);
        BufferedReader br = new BufferedReader(rd);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

    }
}
