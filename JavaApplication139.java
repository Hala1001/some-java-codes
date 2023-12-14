package javaapplication139;  import java.util.ArrayList;
public class JavaApplication139 {
    public static void main(String[] args) {
        s s1 = new s("CS","Ali", 123);
          s s2 = new s("CS","ans", 123);
            s s3 = new s("is","Ala", 123);
              s s4 = new s("is","ooo", 123);
                 s s5 = new s("is","ooo", 123);
        ArrayList <s> is=new   ArrayList <s>();
    is.add(s3);is.add(s4);is.add(s5);
    ArrayList <s> cs=new   ArrayList <s>();
    cs.add(s1);cs.add(s2);
        depar depar1 = new depar("cs",cs);
        depar depar2 = new depar("is",is);
            ArrayList <depar> b=new   ArrayList <depar>();
b.add(depar2);b.add(depar1);
uni university = new uni("PSAU", b);
        System.out.print("Total students in University: "+university.total());

}}
class s{
String dep,name;
int id;
    public s(String dep, String name, int id) {
        this.dep = dep;
        this.name = name;
        this.id = id;
    }
}
class depar{
String dname;
private ArrayList<s>stu;
public depar(String dname,ArrayList<s>stu){
this.dname=dname;
this.stu=stu;
}
public ArrayList<s> getstu(){
return stu;
}
}
class uni{
String dpart;
private ArrayList<depar>part;
ArrayList<s>ss;
public uni(String dpart,ArrayList<depar>part){
this.dpart=dpart;
this.part=part;
}
public int total(){
int total=0;
for(depar x:part)
    total+=x.getstu().size();
return total;
}        
}