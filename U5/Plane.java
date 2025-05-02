/* A class that allows a program to adjust the location (altitude) of a plane. */

public class Plane{
	private int location;
	
	public Plane(){
		location = 0;
	}
		
	public Plane(int loc){
		if (loc <= 2000 && loc >= -2000){
			location = loc;
		}
		
		else{
			location = 0;
		}
	}
	
	void upward(){
		if (location <= 2000 && location >= -2000){
			location = location + 100;
			if (location > 2000){
				location = 2000;
			}
		}
	}
	
	void downward(){
		if (location <= 2000 && location >= -2000){
			location = location - 100;
			if (location < -2000){
				location = -2000;
			}
		}
	}
	
	int getLocation(){
		return location;
	}
	
	public String toString(){
		String posRep = "                                        ";  // String representation of plane position.
		int planePosition = 0;
		planePosition = (location + 2000)/100;
		posRep = posRep.substring(0, planePosition) + "@" + posRep.substring(planePosition + 1);
		//posRep.charAt(planePosition) = "@";
		System.out.println(posRep);
		return ("");
	}
}

			
			 
