/* A class to define the attributes of a dog.  */

public class OverloadDog{

	private String breed;
	private double weight;
	private String name;
	private String colour;

public OverloadDog(String b, double w, String n, String c){

	breed = b;
	weight = Math.abs(w);
	name = n;
	colour = c;
}

public OverloadDog(){

	//breed = "Unknown";
	//weight = 0;
	//name = "Unknown";
	//colour = "Unknown";
	this("Unknown", 0, "Unknown", "Unknown");
}

public OverloadDog(String b, String n){

	this(b, 0, n, "Unknown");
}

//Accessor Methods
public String getBreed(){
	return breed;
}
public double getWeight(){
	return weight;
}
public String getName(){
	return name;
}
public String getColour(){
	return colour;
}

//Mutator Method
public void setBreed(String b){
	breed = b;
}

//Another Mutator Method
public void setColour(String c){
        colour = c;
}

public String toString(){
	System.out.println("A " + weight + " lb. " + breed + " named " + name + " has the colour of " + colour + ".");
	return (name);
}

public boolean equals(OverloadDog other){
        if(breed.equals(other.getBreed()) && weight == other.getWeight() && name.equals(other.getName()) && colour.equals(other.getColour())){
                return true;
        }
        return false;
}
}


	

