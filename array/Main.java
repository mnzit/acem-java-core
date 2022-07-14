import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(new FileReader("file.txt"));

       while(scanner.hasNext()){
           System.out.println(scanner.nextLine());
       }
    }
}
