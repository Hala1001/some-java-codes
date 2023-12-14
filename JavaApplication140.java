package javaapplication140;
public class JavaApplication140 {
    public static void main(String[] args) {
cho ch[]=new cho[4];
ch[0]=new cho(" c"," i",45,120);
ch[1]=new cho(" c"," u",52,120);
ch[2]=new cho(" c"," s",37,120);
    ch[3]=new cho(" c"," c",6,120);
    int t=0;
    double c=0;
    for (cho x:ch){
t+=x.getNum();
c+=x.tc();}
        System.out.println(t);
    int hi=ch[0].getNum();   
    String h=ch[0].getIn();
        for (int i = 1; i <ch.length; i++) {
        if(ch[i].getNum()>hi)
            h=ch[i].getIn();
        }
    System.out.println(h);
        System.out.println(c);
    
    }
}

 class s {
private String n;
private int num,id; 
private double med;
int[]sc=new int [num];

    public s(String n, int num, int id) {
        this.n = n;
        this.num = num;
        this.id = id;
    }
  void fill(){ 
      for (int i = 0; i < sc.length; i++) {
          System.out.println("enter");
          sc[i]=read.nextInt();
      }
      
  }
}