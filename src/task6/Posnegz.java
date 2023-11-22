package task6;
import java.util.Scanner;
public class Posnegz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter any num");
    int n;
    int num = scanner .nextInt();
    if(num > 0)
    {
    	System.out.println("+ve number");
    }
    else if (num < 0)
    {
    	System.out.println("-ve number");
    }
    else 
    {
    	System.out.println("neither  +ve number nor -ve number");
    }
   
	}

}
