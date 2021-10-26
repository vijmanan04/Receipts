* Have fun with the assignment!!       *
****************************************	****************************************
*/	*/



/*
******** Took 5 min and 34 seconds to type this class 
*/
public class Printer { //prints recipt
  double subtotal;
  double[] prices = new double[5];
  int[] qty = new int[5];
  String[] itemNames = new String[5];
  public Printer(double totalPrice, int[] qtys, String[] items, double[] price){ //constructor
    subtotal = totalPrice;
    prices = price;
    qty = qtys;
    itemNames = items;}

    int spaceLeft = 0;
    public void printOrder(){ //Prints only order without subtotals
      System.out.println("Kroger");
      System.out.println("Qty  \t\t\tItem  \t\t\t\tPrice");
      for (int i = 0; i < 5; i++){
        System.out.print(qty[i] + "\t");
        System.out.print(itemNames[i]);
        spaceLeft = 29 - itemNames[i].lenght();
        for (int j = 0; j < 5; j++){
          System.out.print(" ");
        }
        if (prices[i] < 10.0) { //checks for number of characters
          System.out.print
          /*
            ******* This is where I stopped when the quiz ended;
          */
        }


    } // close for loop


}// close class
