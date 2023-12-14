package javaapplication132;
public class JavaApplication132 {
    public static void main(String[] args) {
        
        
        
        
    }   
}
interface m{
double pi=3.13f;
double ca();
}
class cir implements m{
double r;
public cir(double r){
this.r=r;
}
public double ca(){
return pi*r*r;
}
public String tostring(){
return " r"+r;
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
class rec extends poly{
public rec(double h,double w){
super(h,w);
}
//abstract int no(){
//return (h*w);
//}
}