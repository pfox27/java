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
  
  public Car(String make, int year, String model, double mpg)
  {
    count++;
    carID = count;
    setMake();
    setYear();
    setModel();
    setMpg();
  }
  
  public Car()
  {
    this("None", 2000, "None", 0);
  }
  
  public void setMake(){
	  //Scanner scn = new Scanner(System.in);
	  System.out.println("Please enter the make of the vehicle: ");
	  make = scn.nextLine();
  }
  
  public void setYear()
  {
	//Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the year of the vehicle: ");  
    year = scn.nextInt();
    if (year < 1885){
		year = 2000;
	}
	else if (year > 2022){
		year = 2022;
	}
  }
  
  public void setModel()
  {
	//Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the model of the vehicle: ");  
    model = scn.nextLine();
  }
  
  public void setMpg()
  {
	//Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the fuel efficiency of the vehicle in miles per gallon: ");  
    mpg = scn.nextDouble();  
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


