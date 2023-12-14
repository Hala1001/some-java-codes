
package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {
    public static void main(String[] args) {
   
     int num1,num2,num3;
       Scanner read =new Scanner(System.in); 
       System.out.println("input first number");
        System.out.println("input second number");
        System.out.println("input the third num");
        num1=read.nextInt();  
        num2=read.nextInt();
        num3=read.nextInt();
         if (num1>num2 &&num2>num3)
    System.out.print("the max of 3 num is"+(num1)); 
      
    }
   
}
