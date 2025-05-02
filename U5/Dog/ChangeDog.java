/* A programme that changes and accesses the attributes of a dog. */

//import Dog.java;

public class ChangeDog{

//public boolean equals(Dog other){
//	if(breed.equals(other.getBreed()) && weight == other.getWeight() && name.equals(other.getName())){
//		return true;
//	}
//	return false;
//}

public static void main(String Args[]){

	
	Dog d1 = new Dog("Golden Retriever", 23.8, "Marlie", "blonde");

	//Dog d1 = new Dog("Jack Russell Terrier", 14.9, "Eddie", "brown");
	Dog d2 = new Dog("Golden Retriever", 23.8, "Marlie", "blonde");
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
	

