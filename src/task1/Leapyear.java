package task1;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the year");
    int year = scanner.nextInt();
    if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0))
    {
    	System.out.println("the year is leap year");
    }else
    {
    	System.out.println("the year is not a leap year");
    	
    	
    }

	}

}
