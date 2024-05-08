/*  A program that asks the user to input the number of sides and side lengths for a regular polygon and then updates those attributes for an existing polygon.        */

import java.util.Scanner;
import java.lang.Object.*;

public class PolyUpdate{

public static void updatePolygon(RegularPolygon poly2,double Length2, int Sides2) {
        
	poly2.setNumSides(Sides2);
	poly2.setSideLength(Length2);
}
		
public static void main(String Args[]){

RegularPolygon poly = new RegularPolygon();

int Sides = 5;
double Length = 12;
System.out.println(poly);

Scanner sc = new Scanner(System.in);
System.out.println("\nPlease enter the new number of sides for the polygon: ");
Sides = sc.nextInt();
System.out.println("\nPlease enter the new side length for the polygon in cm: ");
Length = sc.nextDouble();
updatePolygon(poly, Sides, Length);
System.out.println("\nThe updated polygon is: ");
System.out.println(poly);

	}
}


