/* SpecialtyCoffee.java - A super class that extends the Coffee class.  */

public class SpecialtyCoffee extends Coffee{
	private String flavour;
	private boolean isSkinny;
	private int shots;
	private String type;
	private String size;
	private String printSkinny;

// First constructor:

	public SpecialtyCoffee(){
		isSkinny = false;
		shots = 1;
		size = "small";
		type = "latte";
		flavour = "vanilla";
	}

// Second constructor:

	public SpecialtyCoffee(String siz, String typ, String flav){
		flavour = flav;
		size = siz;
		type = typ;
		isSkinny = false;
		shots = 1;
	}

	public SpecialtyCoffee(String s, boolean i, int sh, String t, String f){
		flavour = f;
		size = s;
		type = t;
		isSkinny = i;
		shots = sh;
	}

	public String toString(){
		if (isSkinny == false)
			printSkinny = "non-skinny";
		else
			printSkinny = "skinny";

		return "A " + size + ", " + shots + "-shot, " + printSkinny + " " + type + " with " + flavour;
	}
}	
		





