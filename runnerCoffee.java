import java.util.Scanner;
public class runnerCoffee
{

  public static SpecialtyCoffee c;

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose constructor to test:\n1 - SpecialityCoffee()\n2 - SpecialityCoffee(String size, String type, String flavor)\n3 - SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)");
    int which = scan.nextInt();
    if (which == 1)
    {
      c = new SpecialtyCoffee();
    }
    else if (which == 2 || which == 3)
    {
      scan.nextLine();
      System.out.println("Size?");
      String sz = scan.nextLine();
      System.out.println("Type?");
      String tp = scan.nextLine();
      System.out.println("Flavour?");
      String fl = scan.nextLine();
      if (which == 3)
      {
        System.out.println("Is Skinny (y/n)?");
        String sk = scan.nextLine().toLowerCase();
        boolean iS = (sk.equals("y")||sk.equals("yes")||sk.equals("t")||sk.equals("true"));
        System.out.println("Shots?");
        int sh = scan.nextInt();
        c = new SpecialtyCoffee(sz, iS, sh, tp, fl);
      }
      else
      {
        c = new SpecialtyCoffee(sz, tp, fl);
      }
    }
    if(c != null)
    {
      System.out.println(c);
      int p = c.getPrice();
      System.out.println("$"+p/100 + "."+ (p%100)/10 + p%10);
    }
  }
}
