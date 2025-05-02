/*
 * Unit 5 - Lesson 8 - Classes - Static vs Instance (RunnerCar.java)
 */

class RunnerCar
{
  public static void main (String[] args) 
  {
	String carMake = "";
	int carYear = 0;
	String carModel = "";
	double carMPG = 0.0;
	
    Car vehicle1 = new Car();
    Car vehicle2 = new Car(carMake, carYear, carModel, carMPG);

    System.out.println(vehicle1);
    System.out.println(vehicle2);
  }
}
