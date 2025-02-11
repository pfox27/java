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
	public int getPrice(){
		int price;
			if (size.equals("extra large"))
				price = 470 + 50;  // 50 cents extra for syrup
			else if (size.equals("large"))
				price = 440 + 50;  // 50 cents extra for syrup
			else if (size.equals("medium"))
				price = 360 + 30;  // 30 cents extra for syrup
			else
				price = 330 + 30;  // 30 cents extra for syrup

			price += shots*30;
		return price;
  }
	public String toString(){
		if (isSkinny == false)
			printSkinny = "non-skinny";
		else
			printSkinny = "skinny";

		return "A " + size + ", " + shots + "-shot, " + printSkinny + " " + type + " with " + flavour;
	}
}	
		





