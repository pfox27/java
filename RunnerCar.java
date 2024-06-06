/*
 * Unit 5 - Lesson 8 - Classes - Static vs Instance (RunnerCar.java)
 */

class RunnerCar
{
  public static void main (String[] args) 
  {
    Car vehicle1 = new Car();
    Car vehicle2 = new Car(String carMake, int carYear, String carModel, double carMPG);

    System.out.println(vehicle1);
    System.out.println(vehicle2);
  }
}
