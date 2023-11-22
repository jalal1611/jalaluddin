


package task11;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        int a1=2;
        int sum=0;
        System.out.println(a+a1);//0,2
        for (int i=3; i<10; i++)
        {
        	sum=a+a1;
        	System.out.println(""+sum);
        	a=a1;
        	a1=sum;
        }
        }
	
}