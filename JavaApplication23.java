package javaapplication23;
 import java.util.Scanner;
public class JavaApplication23 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 double up,q,dis,rev; 
 System.out.print("Enter up: " ); 
 up = input.nextDouble();
 System.out.print("Enter q: "); 

 q = input.nextDouble(); 
 dis=0;
 if (q <100)
 dis=0;
 else if ((q>=100)&&(q<=120)) 
dis=0.10; 
 else if (q < 120) 
 dis=0.15;
 rev=(1-dis)*up*q;

 System.out.print("price(befor) dis"+q*up+"  "+"sar");
 System.out.println("price(after)dis"+(rev)+"  "+"sar");
 System.out.println("dis amount"+(dis*up*q));

    

    }
    
}
