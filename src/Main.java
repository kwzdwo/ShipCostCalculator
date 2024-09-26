import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP= 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.println("Enter item price ");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clears buffer

            if(itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = SHIP_RATE * itemPrice;
                totalCost= itemPrice + shipCost;
            }
            //Display results
            System.out.println("Shipping Costs are: " + shipCost);
            System.out.println("Total Costs are: " + totalCost);
        }
        else
        {
             trash = in.nextLine();
            System.out.println(trash + " Is not a valid number");
            System.out.println("Run the program again with the right input!!!!!");
        }



    }
}
