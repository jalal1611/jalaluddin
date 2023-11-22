package task7;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
     System.out.println("enter the product price");
     int productprice = scanner.nextInt();
     System.out.println("enter the quantity");
     int quantity = scanner.nextInt();
     int totalcost = quantity * productprice;
     System.out.println("totalcost: " +totalcost);
     
     if(quantity < 10)   {
    	 System.out.println("no discount");
     }else if(quantity > 10)
     {
    	 System.out.println("you get 10% discount");
    	 int discount = (totalcost * 10)/100;
    	 int costtopaid = totalcost - discount;
    	 System.out.println("totalcost after discount" +costtopaid);
    	 
     }
    	 
     
	}

}
