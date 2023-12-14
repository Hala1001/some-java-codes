
package javaapplication20;
import java.util.Scanner;
public class JavaApplication20 {
    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int n1,n2,option;
int reselt=0;
      System.out.println("enter n1");   
    n1=read.nextInt();
     System.out.println("enter n2"); 
    n2=read.nextInt();
      System.out.println("enter n2"); 
      option=read.nextInt();
    switch (option){
                case 1:
                    reselt=n1=n2;
                 break;
                case 2:
                    if(n2!=0)
            reselt=n1/n2;
                    else
                        reselt=0;
              break;        
    }
      System.out.println("reselt="+reselt); 
    }   
    }  
