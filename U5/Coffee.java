/**
* Coffee is a class that creates coffee beverage as objects. 
* The beverages have the following attributes:
* <ul>
* <li>Size (small, medium, large)
* <li>Type (espresso, Canadiano, latte, etc.).
* <li>Shots - The number of espresso shots in the bevewrage.
* <li>Price - in dollars.
* <li>isSkinny - Whether or not low fat dairy is used in the beverage.
* </ul>
*/

public class Coffee
{
  private String size;
  private boolean isSkinny;
  private int shots;
  private String type;

  public Coffee()
  {
    this("small", false, 1, "latte");
  }

/**
 *  This method creates a coffee beverage with default attributes.
 *  @param size Size (String) of the beverage (small, medium, large).
 *  @param isSkinny (boolean) Indicates whether light dairy (skinny) is used or not.
 *  @param shots (int) The number of espresso shots in the beverage.
 *  @param type The type (String) of beverage (espresso, latte, etc.).
 */

  public Coffee(String size, boolean isSkinny, int shots, String type)
  {
    this.size = size;
    this.isSkinny = isSkinny;
    this.shots = shots;
    this.type = type;
  }

/* This method outputs the size, number of shots and type of the beverage. 
 * @return size the size of the beverage.
 * @return shots the number of espresso shots in the beverage.
 * @return type the type of beverage (espresso, latte, etc.).
 */

  public String toString()
  {
    String s = size;
    if (isSkinny)
      s += " skinny";
    return s + " " + shots + "-shot " + type;
  }

/* This method returns the size of the beverage. 
 * @return size the size of the beverage.
 */

  public String getSize()
  {
    return size;
  }

/* This method returns the price of the beverage. 
 * @return price the price of the beverage.
 */

  public int getPrice()
  {
    int price;
    if (size.equals("extra large"))
      price = 470;
    else if (size.equals("large"))
      price = 440;
    else if (size.equals("medium"))
      price = 360;
    else
      price = 330;

    price += shots*30;
    return price;
  }
}

