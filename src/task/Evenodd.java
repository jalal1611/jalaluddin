package task;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = scanner.nextInt();
        if(num % 2 == 0)
        {
        	System.out.println("Num is even");
        }else
        {
            System.out.println("Num is odd");
        	  
        }
	}

}
