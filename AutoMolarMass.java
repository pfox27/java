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
		
		if (symbol == "H")
			MolarMass = 1.01;
		else if (symbol == "He")
			MolarMass = 4.00;
		else if (symbol == "Li")
			MolarMass = 6.94;
		else if (symbol == "Be")
			MolarMass = 9.01;
		else if (symbol == "B")
			MolarMass = 10.81;
		else if (symbol == "C")
			MolarMass = 12.01;
		else if (symbol == "N")
			MolarMass = 14.01;
		else if (symbol == "O") 
			MolarMass = 16.00;
		else if (symbol  == "F")
			MolarMass = 19.00;
		else if (symbol == "Ne")
			MolarMass = 20.18;
		else if (symbol == "Na")
			MolarMass = 22.99;
		else if (symbol == "Mg")
			MolarMass = 24.31;
		else if (symbol == "Al")
			MolarMass = 26.98;
		else if (symbol == "Si")
			MolarMass = 28.09;
		else if (symbol == "P")
			MolarMass = 30.97;
		else if (symbol == "S")
			MolarMass = 32.07;
		else if (symbol == "Cl")
			MolarMass = 35.45;
		else if (symbol == "Ar")
			MolarMass = 39.95;
		else if (symbol == "K")
			MolarMass = 39.10;
		else if (symbol == "Ca")
			MolarMass = 40.08;
		else if (symbol == "Sc")
			MolarMass = 44.96;
		else if (symbol == "Ti")
			MolarMass = 47.87;
		else if (symbol == "V")
			MolarMass = 50.94;
		else if (symbol == "Cr")
			MolarMass = 51.99;
		else if (symbol == "Mn")
			MolarMass = 54.94;
		else if (symbol == "Fe")
			MolarMass = 55.85;
		else if (symbol == "Co")
			MolarMass = 58.93;
		else if (symbol == "Ni")
			MolarMass = 58.69;
		else if (symbol == "Cu")
			MolarMass = 63.55;
		else if (symbol == "Zn")
			MolarMass = 65.38;
		else if (symbol == "Ga")
			MolarMass = 69.72;
		else if (symbol == "Ge")
			MolarMass = 72.64;
		else if (symbol == "As")
			MolarMass = 74.92;
		else if (symbol == "Se")
			MolarMass = 78.96;
		else if (symbol == "Br")
			MolarMass = 79.90;
		else if (symbol == "Kr")
			MolarMass = 83.80;
		else if (symbol == "Rb")
			MolarMass = 85.47;
		else if (symbol == "Sr")
			MolarMass = 87.62;
		else if (symbol == "Y")
			MolarMass = 88.91;
		else if (symbol == "Zr")
			MolarMass = 91.22;
		else if (symbol == "Nb")
			MolarMass = 92.91;
		else if (symbol == "Mo")
			MolarMass = 95.96;
		else if (symbol == "Tc")
			MolarMass = 98;
		else if (symbol == "Ru")
			MolarMass = 101.07;
		else if (symbol == "Rh")
			MolarMass = 102.91;
		else if (symbol == "Pd")
			MolarMass = 106.42;
		else if (symbol == "Ag")
			MolarMass = 107.87;
		else if (symbol == "Cd")
			MolarMass = 112.41;
		else if (symbol == "In")
			MolarMass = 114.82;
		else if (symbol == "Sn")
			MolarMass = 118.71;
		else if (symbol == "Sb")
			MolarMass = 121.76;
		else if (symbol == "Te")
			MolarMass = 127.6;
		else if (symbol == "I")
			MolarMass = 126.91;
		else if (symbol == "Xe")
			MolarMass = 131.29;
		else if (symbol == "Cd")
			MolarMass = 112.41;
		else if (symbol == "In")
			MolarMass = 114.82;
		else if (symbol == "Sn")
			MolarMass = 118.71;
		else if (symbol == "Sb")
			MolarMass = 212.76;
		else if (symbol == "Te")
			MolarMass = 127.6;
		else if (symbol == "I")
			MolarMass = 126.90;
		else if (symbol == "Xe")
			MolarMass = 131.29;
		else if (symbol == "Cs")
			MolarMass = 132.91;
		else if (symbol == "Ba")
			MolarMass = 137.33;
		else if (symbol == "La")
			MolarMass = 138.91;
		else if (symbol == "Hf")
			MolarMass = 178.49;
		else if (symbol == "Ta")
			MolarMass = 180.85;
		else if (symbol == "W")
			MolarMass = 183.84;
		else if (symbol == "Re")
			MolarMass = 186.21;
		else if (symbol == "Os")
			MolarMass = 190.23;
		else if (symbol == "Ir")
			MolarMass = 192.22;
		else if (symbol == "Pt")
			MolarMass = 195.08;
		else if (symbol == "Au")
			MolarMass = 196.97;
		else if (symbol == "Hg")
			MolarMass = 200.59;
		else if (symbol == "Tl")
			MolarMass = 204.38;
		else if (symbol == "Pb")
			MolarMass = 207.2;
		else if (symbol == "Bi")
			MolarMass = 208.98;
		else if (symbol == "Po")
			MolarMass = 209;
		else if (symbol == "At")
			MolarMass = 210;
		else if (symbol == "Rn")
			MolarMass = 222;
		else if (symbol == "Fr")
			MolarMass = 223;
		else if (symbol == "Ra")
			MolarMass = 226;
		else if (symbol == "Ac")
			MolarMass = 227;
		else if (symbol == "Rf")
			MolarMass = 265;
		else if (symbol == "Db")
			MolarMass = 268;
		else if (symbol == "Sg")
			MolarMass = 271;
		else if (symbol == "Bh")
			MolarMass = 272;
		else if (symbol == "Hs")
			MolarMass = 270;
		else if (symbol == "Mt")
			MolarMass = 276;
		else if (symbol == "Ds")
			MolarMass = 281;
		else if (symbol == "Rg")
			MolarMass = 280;
		else if (symbol == "Cn")
			MolarMass = 285;
		else if (symbol == "Nh")
			MolarMass = 284;
		else if (symbol == "Fl")
			MolarMass = 289;
		else if (symbol == "Mc")
			MolarMass = 288;
		else if (symbol == "Lv")
			MolarMass = 293;
		else if (symbol == "Og")
			MolarMass = 294;

		System.out.println("\n" + symbol + "'s molar mass is  \n" + MolarMass); 
		TotalMass = TotalMass + MolarMass * NumberOfAtoms;
		System.out.println("\nTotal mass is now \n" + TotalMass);

	}
	System.out.println("\nThe molar mass of the compound is " + TotalMass + " g/mol.\n");
	System.out.println("");

}
}







