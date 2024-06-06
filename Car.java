/* A class to define the attributes of a dog.  */

import java.util.Scanner;

public class Car
{
  private String make;
  private int year;
  private String model;
  private double mpg;
  private static int count = 0;
  private int carID = 0;
  Scanner scn = new Scanner(System.in);
  
  public Car(String m, int y, String mod, double mpg)
  {
    count++;
    carID = count;
    setMake();
    setYear(y);
    setModel();
    setMpg(mpg);
  }
  
  public Car()
  {
    this("None", 2000, "None", 0);
  }
  
  public void setMake(String make){
	  System.out.println("Please enter the make of the vehicle: ");
	  String make = scn.NextLine();
  }
  
  public void setYear(int y)
  {
	System.out.println("Please enter the year of the vehicle: ");  
    int year = scn.NextInt();
    if (year < 1885){
		year = 2000;
	}
	else if (year > 2022){
		year = 2022;
	}
  }
  
  public int setModel()
  {
	System.out.println("Please enter the model of the vehicle: ");  
    String model = scn.NextLine();
  }
  
  public void setMpg(double mpg)
  {
	System.out.println("Please enter the fuel efficiency of the vehicle in miles per gallon: ");  
    String mpg = scn.NextLine();  
    if (mpg < 0) {
		mpg = 0;
	}
  }
  
  public static int getTotal(){
	  return count;
  }
   
  public String toString()
  {
    return "ID: " + carID + "\n Make: " + make + "\n Model: " + model + "\n Year: " + year + "\n Fuel Efficiency: " + mpg + ".";
  }
 
  }


