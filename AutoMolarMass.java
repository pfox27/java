/* A program that automatically calculates the molar mass of a given chemical compound, given the identity of its constituent atoms. */

import java.util.Scanner;    //Import the scanner class

public class AutoMolarMass{

public static void main(String Args[]){
	System.out.println("\nMolar Mass Calculator\n");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~\n");
	System.out.println("\nPlease enter the number of elements in the compound:\n");
	//int NumberOfElements = 0;
	double MolarMass = 0;
	double TotalMass = 0;
	//int NumberOfAtoms = 0;
	//char Symbol[] = "0";

	//scanf("%d", &NumberOfElements);
	
	Scanner scn = new Scanner(System.in);
	int NumberOfElements = scn.nextInt();
	//scn.nextLine();  // consume \n before String input

	for (int i = 1; i <= NumberOfElements; i++){
		System.out.println("\nPlease enter the symbol for element number " + i + "\n");
		//scanf("%s", &Symbol);
		
		scn.nextLine();  // consume \n before String input	
		String symbol = scn.nextLine();
		System.out.println("\nPlease enter the number of atoms of this element that are in the compound (according to formula)\n");
		//scanf("%d", &NumberOfAtoms);
		
		int NumberOfAtoms = scn.nextInt();
		
		if (symbol.equals ("H"))
			MolarMass = 1.01;
		else if (symbol.equals ("He"))
			MolarMass = 4.00;
		else if (symbol.equals ("Li"))
			MolarMass = 6.94;
		else if (symbol.equals ("Be"))
			MolarMass = 9.01;
		else if (symbol.equals ("B"))
			MolarMass = 10.81;
		else if (symbol.equals ("C"))
			MolarMass = 12.01;
		else if (symbol.equals ("N"))
			MolarMass = 14.01;
		else if (symbol.equals ("O")) 
			MolarMass = 16.00;
		else if (symbol.equals ("F"))
			MolarMass = 19.00;
		else if (symbol.equals ("Ne"))
			MolarMass = 20.18;
		else if (symbol.equals ("Na"))
			MolarMass = 22.99;
		else if (symbol.equals ("Mg"))
			MolarMass = 24.31;
		else if (symbol.equals ("Al"))
			MolarMass = 26.98;
		else if (symbol.equals ("Si"))
			MolarMass = 28.09;
		else if (symbol.equals ("P"))
			MolarMass = 30.97;
		else if (symbol.equals ("S"))
			MolarMass = 32.07;
		else if (symbol.equals ("Cl"))
			MolarMass = 35.45;
		else if (symbol.equals ("Ar"))
			MolarMass = 39.95;
		else if (symbol.equals ("K"))
			MolarMass = 39.10;
		else if (symbol.equals ("Ca"))
			MolarMass = 40.08;
		else if (symbol.equals ("Sc"))
			MolarMass = 44.96;
		else if (symbol.equals ("Ti"))
			MolarMass = 47.87;
		else if (symbol.equals ("V"))
			MolarMass = 50.94;
		else if (symbol.equals ("Cr"))
			MolarMass = 51.99;
		else if (symbol.equals ("Mn"))
			MolarMass = 54.94;
		else if (symbol.equals ("Fe"))
			MolarMass = 55.85;
		else if (symbol.equals ("Co"))
			MolarMass = 58.93;
		else if (symbol.equals ("Ni"))
			MolarMass = 58.69;
		else if (symbol.equals ("Cu"))
			MolarMass = 63.55;
		else if (symbol.equals ("Zn"))
			MolarMass = 65.38;
		else if (symbol.equals ("Ga"))
			MolarMass = 69.72;
		else if (symbol.equals ("Ge"))
			MolarMass = 72.64;
		else if (symbol.equals ("As"))
			MolarMass = 74.92;
		else if (symbol.equals ("Se"))
			MolarMass = 78.96;
		else if (symbol.equals ("Br"))
			MolarMass = 79.90;
		else if (symbol.equals ("Kr"))
			MolarMass = 83.80;
		else if (symbol.equals ("Rb"))
			MolarMass = 85.47;
		else if (symbol.equals ("Sr"))
			MolarMass = 87.62;
		else if (symbol.equals ("Y"))
			MolarMass = 88.91;
		else if (symbol.equals ("Zr"))
			MolarMass = 91.22;
		else if (symbol.equals ("Nb"))
			MolarMass = 92.91;
		else if (symbol.equals ("Mo"))
			MolarMass = 95.96;
		else if (symbol.equals ("Tc"))
			MolarMass = 98;
		else if (symbol.equals ("Ru"))
			MolarMass = 101.07;
		else if (symbol.equals ("Rh"))
			MolarMass = 102.91;
		else if (symbol.equals ("Pd"))
			MolarMass = 106.42;
		else if (symbol.equals ("Ag"))
			MolarMass = 107.87;
		else if (symbol.equals ("Cd"))
			MolarMass = 112.41;
		else if (symbol.equals ("In"))
			MolarMass = 114.82;
		else if (symbol.equals ("Sn"))
			MolarMass = 118.71;
		else if (symbol.equals ("Sb"))
			MolarMass = 121.76;
		else if (symbol.equals ("Te"))
			MolarMass = 127.6;
		else if (symbol.equals ("I"))
			MolarMass = 126.91;
		else if (symbol.equals ("Xe"))
			MolarMass = 131.29;
		else if (symbol.equals ("Cd"))
			MolarMass = 112.41;
		else if (symbol.equals ("In"))
			MolarMass = 114.82;
		else if (symbol.equals ("Sn"))
			MolarMass = 118.71;
		else if (symbol.equals ("Sb"))
			MolarMass = 212.76;
		else if (symbol.equals ("Te"))
			MolarMass = 127.6;
		else if (symbol.equals ("I"))
			MolarMass = 126.90;
		else if (symbol.equals ("Xe"))
			MolarMass = 131.29;
		else if (symbol.equals ("Cs"))
			MolarMass = 132.91;
		else if (symbol.equals ("Ba"))
			MolarMass = 137.33;
		else if (symbol.equals ("La"))
			MolarMass = 138.91;
		else if (symbol.equals ("Hf"))
			MolarMass = 178.49;
		else if (symbol.equals ("Ta"))
			MolarMass = 180.85;
		else if (symbol.equals ("W"))
			MolarMass = 183.84;
		else if (symbol.equals ("Re"))
			MolarMass = 186.21;
		else if (symbol.equals ("Os"))
			MolarMass = 190.23;
		else if (symbol.equals ("Ir"))
			MolarMass = 192.22;
		else if (symbol.equals ("Pt"))
			MolarMass = 195.08;
		else if (symbol.equals ("Au"))
			MolarMass = 196.97;
		else if (symbol.equals ("Hg"))
			MolarMass = 200.59;
		else if (symbol.equals ("Tl"))
			MolarMass = 204.38;
		else if (symbol.equals ("Pb"))
			MolarMass = 207.2;
		else if (symbol.equals ("Bi"))
			MolarMass = 208.98;
		else if (symbol.equals ("Po"))
			MolarMass = 209;
		else if (symbol.equals ("At"))
			MolarMass = 210;
		else if (symbol.equals ("Rn"))
			MolarMass = 222;
		else if (symbol.equals ("Fr"))
			MolarMass = 223;
		else if (symbol.equals ("Ra"))
			MolarMass = 226;
		else if (symbol.equals ("Ac"))
			MolarMass = 227;
		else if (symbol.equals ("Rf"))
			MolarMass = 265;
		else if (symbol.equals ("Db"))
			MolarMass = 268;
		else if (symbol.equals ("Sg"))
			MolarMass = 271;
		else if (symbol.equals ("Bh"))
			MolarMass = 272;
		else if (symbol.equals ("Hs"))
			MolarMass = 270;
		else if (symbol.equals ("Mt"))
			MolarMass = 276;
		else if (symbol.equals ("Ds"))
			MolarMass = 281;
		else if (symbol.equals ("Rg"))
			MolarMass = 280;
		else if (symbol.equals ("Cn"))
			MolarMass = 285;
		else if (symbol.equals ("Nh"))
			MolarMass = 284;
		else if (symbol.equals ("Fl"))
			MolarMass = 289;
		else if (symbol.equals ("Mc"))
			MolarMass = 288;
		else if (symbol.equals ("Lv"))
			MolarMass = 293;
		else if (symbol.equals ("Og"))
			MolarMass = 294;

		System.out.println("\n" + symbol + "'s molar mass is  \n" + MolarMass); 
		TotalMass = TotalMass + MolarMass * NumberOfAtoms;
		System.out.println("\nTotal mass is now \n" + TotalMass);

	}
	System.out.println("\nThe molar mass of the compound is " + TotalMass + " g/mol.\n");
	System.out.println("");
	scn.close();
}
}







