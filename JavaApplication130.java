package javaapplication130;
public class JavaApplication130 {
    public static void main(String[] args) {

    }
    
}
class p{
private int x,y;
public p(int x,int y){
this.x=x;this.y=y;     
}
    public int getx() {
        return x;
    }
public int gety(){
return y;
}
}
 abstract class sh{
 p s;
    public sh(p s) {
        this.s=s;
    }
 public p gets(){
 return s;
 }
 public abstract double area();
 }
interface  able{
void print ();
}
class rec extends sh implements able{
    int l,w;
    p d;
    public rec(p d,p s) {
        super(s);
        this.d=d;
    }
    public double area(){
    return l*w;
    }
    public void print (){
        System.out.println("***************************************************");
    }
}
class line implements able{
    p start,end;
    public line(p start ,p end){
    this.end=end;
    this.start=start;
    }
    
public void print(){

}

}