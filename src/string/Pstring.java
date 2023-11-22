package string;
import java.util.Scanner;
public class Pstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter you string");
    String str = sc.next();
    String org_str = str;
    String rev="";
    int len = str.length();
    for(int i=len-1;i>=0;i--)
    {
    	rev=rev+str.charAt(i);
    }
      System.out.println(rev) ; 
	}

}
