package task4;
import java.util.Scanner;
public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("enter the marks");
 int marks = scanner.nextInt();
 
 if(marks <= 34)
 {
	 System.out.println("fail");
 }
 else if(marks >= 35 && marks < 45)
 {
	 System.out.println("grade D");
 }
 else if(marks >= 45 && marks < 60)
 {
	 System.out.println("grade C");
 }
 else if(marks >= 60 && marks < 70)
 {
	 System.out.println("grade B");
 }
 else if(marks >= 70 && marks < 85)
 {
	 System.out.println("grade A");
 }
 else if(marks >= 85 && marks < 95)
 {
	 System.out.println("grade A++");
 }
 else if(marks >= 95 && marks == 100)
 {
	 System.out.println("grade outstanding");
 }
 else if(marks <= 101)
 {
	 System.out.println("Invalid");
 }
    scanner.close();
 }
	}


