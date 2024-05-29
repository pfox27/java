/* A programme that changes and accesses the attributes of a dog. */

//import Dog.java;

public class OverloadChangeDog{

//public boolean equals(Dog other){
//	if(breed.equals(other.getBreed()) && weight == other.getWeight() && name.equals(other.getName())){
//		return true;
//	}
//	return false;
//}

public static void main(String Args[]){

	
	OverloadDog d1 = new OverloadDog("Golden Retriever", 23.8, "Marlie", "blonde");

	OverloadDog d2 = new OverloadDog("Jack Russell Terrier", 14.9, "Eddie", "brown");
	//OverloadDog d2 = new OverloadDog("Golden Retriever", 23.8, "Marlie", "blonde");
	System.out.println("The current breed of dog 1 is: " + d1.getBreed());
	System.out.println("The current breed of dog 2 is: " + d2.getBreed());
	if (d1.equals(d2))
		System.out.println("Dogs d1 and d2 are identical.");
	
	else System.out.println("Dogs d1 and d2 are not identical.");
	
	//System.out.println(d1);  This is identical to the line below because toString is called by default
	System.out.println(d1.toString());   //Calling to toString in Dog.
	//System.out.println(d2);  This is identical to the line below because toString is called by default
	System.out.println(d2.toString());
	OverloadDog d3 = new OverloadDog();
	System.out.println(d3);
	OverloadDog d4 = new OverloadDog("Collie", "Sam");
	System.out.println(d4);
}
}
	

