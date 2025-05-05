/* This is a class file that will write output to a text file stored in the same directory as the programme. */

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void PersonalInfo(String name, int height, int weight, int age, String citizenship) {
    try {
      FileWriter personalInfo = new FileWriter("PersonalInfo.txt");
      personalInfo.write(name + height + age + weight + citizenship);
      personalInfo.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


