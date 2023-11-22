package task5;
import java.util.Scanner;
public class Largenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter first num");
    int n1 = scanner.nextInt();
    System.out.println("enter second num");
    int n2 = scanner.nextInt();
    System.out.println("enter third num");
    int n3 = scanner.nextInt();
    if(n1 > n2)
    	if(n1 >n3)
    		System.out.println("largest num is"+n1);
    if(n2 > n1)
    	if(n2 > n3)
    		System.out.println("largest num is"+n2);
    if(n3 >n1)
    	if(n3 >n2)
    		System.out.println("largest num is+n3");
	}

}
