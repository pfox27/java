import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class PrintToText {
  public static void main(String[] args) {
    try {
      File myObj = new File("PersonalInfo.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
 
  WriteToFile.PersonalInfo("Lex Luthor", 240, 223, 78, "American");

  }

}






