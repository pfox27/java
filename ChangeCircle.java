/* A programme that changes the radius of a circle and displays the new attributes. */

import shapes.*;


public class ChangeCircle{

	public static void change(Circle newC){
		System.out.println(newC);
		newC.setRadius(3);
		System.out.println(newC);
}

	public static void main(String[] args){
	
		Circle c = new Circle();
		System.out.println(c); 
		change(c);
		System.out.println(c);
}

}





