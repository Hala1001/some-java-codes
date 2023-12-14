
package javaapplication128;
public class JavaApplication128 {
    public static void main(String[] args) {
//        classic o=new classic(5,5);
  villa []v=new villa[3];    
        v[0]=new villa(450,1000);
        v[1]=new classic(200,500);
        v[2]=new lu(200,500);
        for (villa q:v)
            System.out.println(q.toString());
    }   
}
class villa{
protected int squ;
protected double cost;
    public villa(int squ, double cost) {
        this.squ = squ;
        this.cost = cost;
    }
public double price(){
return 0;
}
    public String toString() {
        return "villa{" + "squ=" + squ + ", cost=" + cost + "  p   "+price()+'}';
    }
}
class classic extends villa{
    public classic(int squ, double cost) {
        super(squ, cost);
    }
    public double price() {
        return cost*squ;
    }
    public String toString(){
    return "classic{" + "squ=" + squ + ", cost=" + cost +" p "+ price() +'}';
    }
}
class lu extends villa{
    public lu(int squ, double cost) {
        super(squ, cost);
    }
public double price(){
return (squ*cost*1.5);
}
    public String toString() {
        return "lu{" + "squ=" + squ + ", cost=" + cost +"P   "+price()+'}';
    }

}