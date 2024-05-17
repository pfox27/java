/* A programme that changes and accesses the attributes of a dog. */

import java.util.Scanner;     //Import the Scanner class

public class ChangeDog{

public static void main(String Args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the breed for dog 1: ");
	String dog1Breed = sc.nextLine();
	System.out.println("Please enter the weight for dog 1: ");
	double dog1Weight = sc.nextDouble();
	System.out.println("Please enter the name for dog 1: ");
	String dog1Name = sc.nextLine();
	System.out.println("Please enter the colour for dog 1: ");
	String dog1Colour = sc.nextLine();
	System.out.println("Please enter the breed for dog 2: ");
	String dog2Breed = sc.nextLine();
	System.out.println("Please enter the weight for dog 2: ");
	double dog2Weight = sc.nextDouble();
	System.out.println("Please enter the name for dog 2: ");
	String dog2Name = sc.nextLine();
	System.out.println("Please enter the colour for dog 2: ");
	String dog1Colour = sc.nextLine();

	Dog d1 = new Dog(dog1Breed, dog1Weight, dog1Name, dog1Colour);
	Dog d2 = new Dog(dog2Breed, dog2Weight, dog2Name, dog2Colour);

	//Dog d1 = new Dog("Jack Russell Terrier", 14.9, "Eddie", "brown");
	//Dog d2 = new Dog("Golden Retriever", 23.8, "Marlie", "blonde");
	System.out.println("The current breed of dog 1 is: " + d1.getBreed());
	System.out.println("The current breed of dog 2 is: " + d2.getBreed());
	if (d1.equals(d2))
		System.out.println("Dogs d1 and d2 ar identical.");
	//System.out.println(d1);  This is identical to the line below because toString is called by default
	System.out.println(d1.toString());   //Calling to toString in Dog.
	//System.out.println(d2);  This is identical to the line below because toString is called by default
	System.out.println(d2.toString());
}
}
	

