
package javaapplication25;  import java.util.Scanner;
public class JavaApplication25 {
  
 public static void main(String[] args) {
 String message; 
 double amount;
 double balance=315.47;
 Scanner scan=new Scanner(System.in);
 System.out.print ("Please enter the amount: "); 
 amount=scan.nextDouble(); 
 if (amount > balance)
 message="Check your balance"; 
 
 else {
 balance-=amount; 
 message=" Transaction successful"; }
 System.out.println (message); 
 System.out.println("Your new balance ="+(int)balance);
        
        
              
}
}