package string;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("enter sentence");
         String str=sc.nextLine();
         str=str.toLowerCase();
         int count;
         String[] word=str.split(" ");
         for(int i=0;i<word.length;i++)
         {
        	 count=1;
        	 for(int j=i+1;j<word.length;j++) {
        		 if(word[i].equals( word[j]))
        		 {
        			 count++;
        			 word[j]="0";
        			 
        		 }
        		 
        	 }
        	 if(count>1 && word[i]!="0")
        	 {
        		 System.out.println(word[i]);
        	 }
         }
	}

}
