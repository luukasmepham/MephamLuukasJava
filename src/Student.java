import java.util.Scanner; 
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Student {

    void StudentWrite(String name) {
      try (FileWriter fw = new FileWriter("MephamLuukasJava/src/Students.txt", true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter out = new PrintWriter(bw)) 
           {
            out.println(name);
            } catch (IOException e) {
              System.out.println("An error occurred while trying to write to file.");
              e.printStackTrace();
            }
    }

    void StudentRead() {
      try {
        File Reader = new File("MephamLuukasJava/src/Students.txt");
        Scanner output = new Scanner(Reader);
        while (output.hasNextLine()) {
          String data = output.nextLine();
          System.out.println(data);
        }
        output.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred while trying to read the file.");
        e.printStackTrace();
      }
    }
  }
