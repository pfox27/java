/* A class to define the attributes of a dog.  */

public class Dog{

	private String breed;
	private double weight;
	private String name;
	private String colour;

public Dog(String b, double w, String n, String c){

	breed = b;
	weight = Math.abs(w);
	name = n;
	colour = c;

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

public boolean equals(Dog other){
        if(breed.equals(other.getBreed()) && weight == other.getWeight() && name.equals(other.getName()) && colour.equals(other.getColour())){
                return true;
        }
        return false;
}


}
	

