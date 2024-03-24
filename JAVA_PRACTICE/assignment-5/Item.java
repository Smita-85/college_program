//class,object and public constructor example
class Item
{
  String name;
  double price;
  int quantity;
  double value;
  Item(String n,double p,int q)
  {
   name=n;
   price=p;
   quantity=q;
  }
  public String getName()
  {
   return name;
   }
   public double getPrice()
   {
    return price;
	}
	public int Quantity()
	{
	return quantity;
	}
	public double getValue()
	{
	 value=quantity*price;
	 return value;
	}
	public void display()
    {
   System.out.println(name+" "+price+" "+quantity+" "+value);
    } 
}
class Inventory
{	
 public static void main(String args[])
 {
  Item i1=new Item("potato",30,1);
  i1.getName();
  i1.getPrice();
  i1.Quantity();
  i1.getValue();
  i1.display();
  Item i2=new Item("Tomato",40,2);
  i2.getName();
  i2.getPrice();
  i2.Quantity();
  i2.getValue();
  i2.display();
 }
 } 