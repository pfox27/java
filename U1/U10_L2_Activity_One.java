public class U10_L2_Activity_One
{

  public static String stringReverse(String word)
  {
    if (word.length() > 0)
    {
     String s = stringReverse(word.substring(2)) + word.substring(0,1);

    }
      return word;

  }

}
