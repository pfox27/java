/* A class to define the attributes of a dog.  */

public class Dog2
{
  private String breed;
  private int weight;
  private String name;
  private String colour;
  private static int num = 0;
  private int dogID;
  
  public Dog2(String b, int w, String n, String c)
  {
    System.out.println("Creating a dog with 4 arguments and the current dog ID is: " + Dog2.getTotal());
    setBreed(b);
    setWeight(w);
    setName(n);
    setColour(c);
    num++;
    dogID = num;
  }
  
  public Dog2()
  {
    this("Unknown", 0, "None", "Unknown");
    //System.out.println("Creating a dog with 0 arguments and the current dog ID is: " + Dog2.getTotal());
    //num++;
    //dogID = num;
  }
  
  public Dog2(String b, String n)
  {
    System.out.println("Creating a dog with 2 arguments and the current dog ID is: " + Dog2.getTotal());
    breed = b;
    weight = 0;
    name = n;
    colour = "Unknown";
    num++;
    dogID = num;
  }
  
  public void setWeight(int w)
  {
    weight = w;
  }
  
  public int getWeight()
  {
    return weight;
  }
  
  public void setName(String n)
  {
    name = n;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setColour(String c)
  {
    colour = c;
  }
  
  public static int getTotal(){
	  return num;
  }
 
  public String getColour()
  {
    return colour;
  }
  
  // Mutator Method
  public void setBreed(String b)
  {
    breed = b;
  }
  
  // Accessor Method
  public String getBreed()
  {
    return breed;
  }
  
  public String toString()
  {
    return dogID + ". A " + weight + "lb. " + breed + " named " + name + " with " + colour + " fur.";
  }
  
  public boolean equals(Dog other)
  {
    if (breed.equals(other.getBreed()) && weight == other.getWeight() && name.equals(other.getName()))
    {
      return true;
    }
    return false;
  }
}

