
package javaapplication19; 
import java.util.Scanner;
public class JavaApplication19 {
public static void main(String[] args) {
 Scanner read =new Scanner(System.in);
int result=0; 
int choice,n1,n2;
   System.out.println("enter choice");
    System.out.println("1:sum");
     System.out.println("2:double");
      System.out.println("3:square");
   choice=read.nextInt();
     switch (choice){    
 case 1 : 
     System.out.println("enter 2 mum");
       n1=read.nextInt();
    n2=read.nextInt();
  result=n1=n2;
   break;
    case 2 :
 System.out.println("enter 1 mum"); 
     n1=read.nextInt();
  result=n1*2;
 break;
 case 3: System.out.println("enter 1 mum"); 
 n1=read.nextInt();
 result=n1*n1;
 break;
 default:
 System.out.println("sorry"); 
    } 
      System.out.printf("your choice :%d",result); 
      
    }  
}
