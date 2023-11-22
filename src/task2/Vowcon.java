package task2;
import java.util.Scanner;
public class Vowcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scanner.next().charAt(0);
        
        if(ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
        	System.out.println("character is vowel");
        }
        else
        {
        	System.out.println("character is consonant");
        }
	}

}
