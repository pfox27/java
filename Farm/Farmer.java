public class Farmer
{
  private String forename;
  private String surname;

  public Farmer(String f, String s)
  {
    forename = f;
    surname = s;
  }

  public String toString()
  {
    return forename + " " + surname;
  }
}
