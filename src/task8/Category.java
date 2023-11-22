package task8;
import java.util.Scanner;
public class Category {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        String Category;
        
        if (age >= 0 && age <= 12) {
        	Category = "Child";
        }
        else if (age >= 13 && age <= 19) {
        	Category = "teenager";
        }
        else if (age >= 20 && age <= 64) {
        	Category = "Adult";
        }
        else
        {
        	Category = "Senior";
        }
        System.out.println("you are a" +Category+"." );
        }
	}


