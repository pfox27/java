/*
 * Unit 5 - Lesson 8 - Classes - Static vs Instance (RunnerDog2.java)
 */

class RunnerDog2
{
  public static void main (String[] args) 
  {
    Dog2 pup1 = new Dog2();
    Dog2 pup2 = new Dog2("Yorkie", "Teacup");
    Dog2 pup3 = new Dog2("Bulldog", 50, "Brutus", "White");

    System.out.println(pup1);
    System.out.println(pup2);
    System.out.println(pup3);
  }
}
