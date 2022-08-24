import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleA320871 {
  public static void main(String[] args) {
    try {
      Scanner myReader = new Scanner(new File("exampleA.txt"));
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}