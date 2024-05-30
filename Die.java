/* A class that defines a six-sided die. */

public class Die{

private int value;
private int numSides;

public void roll(){
	value = (int) (Math.random() * numSides) + 1;
}

public Die(int sides){
	numSides = sides;
	roll();
	System.out.println("The value rolled is: " + value);
}

public Die(){
	this(6);    // Another constructor for six sides only.  This must be the first line.
	//System.out.println("The value rolled is: " + value);
}
}

