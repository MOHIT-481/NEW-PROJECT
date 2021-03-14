public static void main (String[] args)
   {
      double price;
      String decision;
      String item;

      do
      {
      Scanner scan = new Scanner(System.in);

      //Name of the item
      System.out.println("What is the name of your item?");
      item = scan.nextLine(); 

      //Price of the item
      System.out.println("What is the price of your item?");
      price = scan.nextDouble();

      //Whether item is on sale
      System.out.println("Is this item on sale?");
      String sale = scan.next();

      System.out.println("Do you have more items? (Yes/No)");
      decision = scan.next(); 
      }while (decision.equalsIgnoreCase("yes"));

      System.out.println("Grocery bill");
      System.out.println();
      System.out.println("purchases");
      System.out.print(item + ": " + "$" + price);

   }