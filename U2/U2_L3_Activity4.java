/* U2_L3_Activity4 - More with String methods */

import java.util.Scanner;

/* Unit 2 Lesson 3 Coding Activity 4 */

public class U2_L3_Activity4{

    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);  //Create a new scanner object
        System.out.println("Enter a sentence:");
        String sentence = myObj.nextLine();    //Read user input
        int space = sentence.indexOf(" ");
      //  System.out.println(sentence.substring(0, space));
        System.out.println(space);

    }


}

