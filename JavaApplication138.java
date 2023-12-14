
package javaapplication138;
public class JavaApplication138 {
    public static void main(String[] args) {
        c c1 = new c("can","red",20,2015);
        c c2 = new c(" kod","gg",30,2017);
        c.setSuc("can");
            c.setSuc("kod");
            System.out.println(c1.rev());
            System.out.println(c2.rev()); 
             System.out.println(c.rev());
    }
    
}
interface cli{
public abstract void cli(boolean sh,boolean is); 
}
class c implements cli{
    String name,color;
protected int fps,ry;
protected static int suc,sold=0;
    public c(String name, String color, int fps, int ry) {
        this.name = name;
        this.color = color;
        this.fps = fps;
        this.ry = ry;
        this.sold++;
    }
   public void cli(boolean sh,boolean is){
       if (sh && is==true) {
           System.out.println("good");
       }
       else
       System.out.println("poor");
   }
    public static void setSuc(String n) {
        if (n=="can") 
            suc=2;
            else suc=4;  
    }
public static String rev(){
    if (sold>=suc) 
    return "secc";
    return "ffff";
}
    public String toString() {
        return  "name=" + name + ", color=" + color +  ", fps=" + fps + ", ry=" + ry + '}';
    }}
