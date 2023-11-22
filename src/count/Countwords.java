package count;
import java.util.Scanner;
public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine(); // Welcome to Java
        int count=1;
        for (int i=0;i<s.length()-1;i++)
        {
        if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
        		
        	{
        		count++;
        		
        	}
        }
        System.out.println("num of words in a string"+count);
	}

}
