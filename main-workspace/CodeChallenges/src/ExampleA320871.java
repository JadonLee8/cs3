import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleA320871 {
  public static void main(String[] args) {
	  Scanner myReader = null;
    try {
      myReader = new Scanner(new File("exampleA.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      System.out.println("Couldn't find file.");
    }
    int n = myReader.nextInt();
    myReader.nextLine();
    for (int i = 0; i < n; i++) {
    	System.out.println(myReader.nextLine());
    }
    myReader.close();
  }
}