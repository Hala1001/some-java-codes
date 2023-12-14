
package javaapplication144;

import java.util.ArrayList;

public class JavaApplication144 {
    public static void main(String[] args) {
        s []ss=new s[2];
        ss[0]=new s();
        ss[0].setp("nora", 19);
        ss[0].setGp(4.5);
        ss[1]=new s (3.5,"sara",20);
       for(s x:ss)
            System.out.println(x.getClass().getSimpleName());
//    ArrayList<emp>e=new  ArrayList<emp>();
//t a1 =new t("ahmed",15415,8000,"m");
//       man a2 =new man("fahed",19324,3000,5);
//       t a3 =new t("abduallh",15619,5000,"b");
//       t a4 =new t("mohamad",14514,6000,"b");
//       man a5 =new man("omar",12451,9000,15);
//       e.add( a1);
//     e.add( a2);
//      e.add( a3);
//        e.add( a4);
//         e.add( a5);
//    sch s = new sch("u",e);
//s.dis();
//int num=0; double sum=0;
//for(emp x:e){
//    if (x instanceof man   ) {
//        num++;
//    }}
//for(emp x :e)
//  sum+=x.cal();
//        System.out.println(num  + sum);  
    }
    }

 class p {
protected String name;
protected int age;
    public p() {
    }
    public p(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setp(String name,int age) {
        this.name = name;  this.age = age;
    }
    public String toString() {
        return "p{" + "name=" + name + ", age=" + age + '}';
    }
}
class s extends p{
private double gp;
public s (){
super();
this.gp=0;
}
    public s(double gp, String name, int age) {
        super(name, age);
        this.gp = gp;
    }
    public void setGp(double gp) {
        this.gp = gp;
    }
    public String toString() {
        return super.toString()+ "qp" + gp;
    }
}
//class man extends emp{
//private int year;
//    public man(String name, int id, double base,int year) {
//        super(name, id, base);
//        this.year=year;
//    }
//public  double cal(){
//    if (year>20) {
//        return  base+base*0.25;
//    }
//    else if (year >10)
//        return base+base*0.15;
//                else return   base+base*0.025;
//}
//    public String toString() {
//        return super.toString()+ "year=" + year+ "new  "+cal();
//    }
//}
//class sch{
//private String name;
//private ArrayList<emp> list;
//    public sch(String name, ArrayList<emp> list) {
//        this.name = name;
//        this.list = list;
//    }
//public void add(emp emp){
//list.add(emp);
//}
//    public ArrayList<emp> getList() {
//        return list;
//    }
//public void dis(){
//    System.out.println("name  "+name );
//    for (emp x:list) {
//        System.out.println( x.toString()+x.getClass().getSimpleName());
//}}
//}