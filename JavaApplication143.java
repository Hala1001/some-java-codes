
package javaapplication143;

import java.util.Scanner;

public class JavaApplication143 {
    public static void main(String[] args) {
          Scanner input=new Scanner (System.in);
          std d1=new std(123,"Ahmad",5);
    d1.fillso();
    System.out.println("Enter index to get its score");
    int i=input.nextInt();
        System.out.println(d1.getonescore(i)); 
    d1.display();
    }
}
class std{
    private int id;
    private String name;
    private int numcor;
    private int []so;
     Scanner input=new Scanner (System.in);
    public std(int id, String name, int numcor) {
        this.id = id;
        this.name = name;
        this.numcor = numcor;
        so=new int[numcor];
    }
    public void fillso(){
        boolean x=false;
        do {
        try{
        for(int i=0;i<so.length;i++){
            System.out.println("Enter score");
            so[i]=input.nextInt();
        }
        }
        catch(Exception e){
                System.out.println(e);  
                x=true;
                input.nextInt();
                }
}while (x==true);
    }
       public int getonescore(int i){
           int x=0;
           try{
 x=so[i];
           }
           catch(Exception e){
               System.out.println(e);    
           }
          return  x ;
       } 
       public void display(){
           System.out.println("Student information");
           System.out.println("ID:"+id);
           System.out.println("Nmae:"+name);
           System.out.println("Number of score:"+numcor);
           for(int xx:so)
               System.out.print(xx+"\t");
           
       }
    }