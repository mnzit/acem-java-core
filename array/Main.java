import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = br.readLine()) != null)  System.out.println(line);
        while ((line = br.readLine()) != null)  System.out.println(line);


    }
}
