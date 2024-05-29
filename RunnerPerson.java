import java.util.Scanner;
//import Person.java;
 
public class RunnerPerson 
{
 
  public static void main(String[] args) 
  {
 
       Scanner scan = new Scanner(System.in);
 
       System.out.println("Enter the person's first name:");
       String firstName = scan.nextLine();
       System.out.println("Enter the person's last name:");
       String lastName = scan.nextLine();
       System.out.println("Enter the person's age:");
       int age = scan.nextInt();
       scan.nextLine();
       System.out.println("Enter the person's social security number:");
       String ssn = scan.nextLine();
 
       System.out.println();
       Person person = new Person(firstName, lastName, age, ssn);
       //System.out.println(person);
       System.out.println(person.toString());   //Calling to toString in Person.
  }
}
