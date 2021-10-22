/*
******** Took 5 min and 34 second to type this class
Description of my process 
To start off, I needed to fix my syntax errors from the quiz, which I did and consisted mainly of semi-colon errors. 
I started to continue the logic for the printOrder() function that I had left on. My thought process in making this function
was that I need to first use math to calculate how much space is left, and then use a for-loop to create that many space. I realized
that I needed to use a for-loop because the length of the food in the inventory changed. After making the changes to the previous function, I 
made the printTotal() function that used very simillar logic to the printOrder() logic. However, I realized that, in this case, we knew the maximum length
of the descriptor words, meaning 'total', 'subtotal', and 'tax', which was 8 due to the 'subtotal' being the longest. What I saw that I could do was make the
smaller sized words equal in string length to subtotal by adding spaces in the string to get to 8 total characters. Now since all the descriptors have the same 
length, I just needed to program a constant number of spaces. Lastly, since the prices could be 4 or 5 charactes long (including decimal point), I used condtionals
to format the numbers so that an extra space was made in front of the prices with 4 characters, to make them 5. In general, my process invovled a lot of checking
the alignment of the printer and finding ways to break down the complexity into smaller parts that allowed me to slowly tackle the problem. I struggled with getting
all of the items to align within 40 characters, but the way I figured this out was by calculating the out the spacesby hand and double checking in code.
*/
public class Printer { //prints recipt
  
  // initialize the necessary quantities that need to be printed
  double subtotal;
  double[] prices = new double[5];
  int[] qty = new int[5];
  String[] itemNames = new String[5];


  public Printer(double totalPrice, int[] qtys, String[] items, double[] price){ //constructor
    subtotal = totalPrice;
    prices = price;
    qty = qtys;
    itemNames = items;
  }

  public void printHeader(){ // prints the header for the receipt
    for(int i = 0; i < 40; i++){ // 40 char output
      System.out.print("*");
    }
    System.out.println("");


  }

  int spaceLeft = 0; // counts how much space is left since amount of space remaining changes
  public void printOrder(){ //Prints only order without subtotals
    System.out.println("Kroger");
    System.out.println("Qty              Item              Price"); // 40 char output 
    // 3 + 2 + (3 * 4) + 4 + 2 + (3 * 4) + 5 = 40 char
    for (int i = 0; i < 5; i++){
      System.out.print(qty[i] + "\t\t "); // 1 + 2 + (3 * 4) = 15 char
      System.out.print(itemNames[i]);

      spaceLeft = 17 - itemNames[i].length(); // 40 char - 17 char - 5 char - 1 char - length of name (for dollar sign) =
      for (int j = 0; j < spaceLeft; j++){
        System.out.print(" ");
      }
      System.out.print("$"); // print dollar sign before each number

      if (prices[i] < 10.0) { //checks for number of characters
        System.out.print(" " + prices[i]); // prints out 5 chars
      }
      if (prices[i] >= 10.0) { //checks for number of characters
        System.out.print(prices[i]); // prints out 5 chars
      }
      System.out.println(""); // adds a new line after each entry in purchase summary
    } // close for loop
    System.out.println(""); // adds a new line once to give space between subtotal and purchase summary
  } // close function

  public void printTotals(){ // print total values like subtotal, tax, and total
	for (int i = 0; i <  34; i++){
		System.out.print(" "); // print spacing for the dashes
	}
	System.out.println("______"); // add dashes to split the totals from the subtotals
    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" "); // print calculated spaces
    }
    System.out.print("Subtotal       $"); //15 chars printed here
    if (subtotal < 10.0) { //checks for number of characters
      System.out.print(" " + subtotal); // prints out 5 chars
    }
    if (subtotal >= 10.0) { //checks for number of characters
      System.out.print(subtotal); // prints out 5 chars
    }

    System.out.println(""); // add a line between subtotal and tax



    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" "); // print calculated spaces
    }
    System.out.print("Tax 7%         $"); // 12 char printed here
    if ((subtotal * 0.07) < 10.0) { //checks for number of characters
      System.out.print(String.format(" " + "%.2f", (subtotal * 0.07))); // format to two decimal places; print tax
    }
    if ((subtotal * 0.07 )>= 10.0) { //checks for number of characters
      System.out.print(String.format("%.2f", (subtotal * 0.07))); // format to two decimal places; print tax
    }

    System.out.println(""); // add a line between tax and total



    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" ");
    }
    System.out.print("Total          $"); // 12 char printed here
    if ((subtotal + subtotal * 0.07) < 10.0) { //checks for number of characters
      System.out.print(" " + String.format("%.2f", (subtotal + subtotal * 0.07))); // format to two decimal places; print total
    }
    if (subtotal >= 10.0) { //checks for number of characters
      System.out.print(String.format("%.2f", (subtotal + subtotal * 0.07))); // format to two decimal places; print total
    }

    System.out.println(""); // pleasing to the eye 



  } // close printTotal() function
}// close class
