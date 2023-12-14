package javaapplication133;
import java.util.ArrayList;
public class JavaApplication133 {
    public static void main(String[] args) {
//     m arr[]=new m[2];   
//        arr[0]=new rec(2,4);
//         arr[1]=new c(5);
//         for (m x: arr)
//         System.out.println("area of "+ x.getClass()+"is"+x.cm());
   ArrayList <m> arr=new ArrayList<m>();
   arr.add(new rec(2,4));
   arr.add(new c(5));
        for (m x: arr) {
            System.out.println(x.cm());
        }
        double total=0;
        for (m xx:arr) {
            total+=xx.cm();
        }
    }
}
interface   m{
double pi=3.14;
double cm();
}
class c implements m{
double r;
public c(double r){
this.r=r;
}
public double cm(){
return pi*r*r;
}
    public String toString() {
        return "c{" + "r=" + r + '}';
    }
}
abstract class poly implements m{
protected double h,w;
    public poly(double h, double w) {
        this.h = h;
        this.w = w;
    }
abstract int no();
}
class rec   extends poly{
public rec(double h, double w){
super(w,h);
}
public double cm(){
return h*w;
}
 int no(){
return 4;
}
 public String tostring(){
 return "  h"+h+ "  w"+ w;
 }
        }