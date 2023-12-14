package javaapplication136;
public class JavaApplication136 {
    public static void main(String[] args) {
        page page = new page(200);
        dic dic = new dic(1000,page,"ba");
        System.out.println("name "+ dic.getName()+ " num  " +dic.getPage()+ "  w " + dic.count());
    }
    
}
class page{
private int word;
public page(int w){
this.word=w;
}
    public int getWord() {
        return word;
    }
}
class book{
protected int page;
private page p;
public book(int page,page p){
this.p=p;
this.page=page;
}
    public int getPage() {
        return page;
    }
    public page getP() {
        return p;
    }
}
class dic extends book{
private String name;
    public dic(int page,page p,String n) {
        super(page, p);
        name=n;
    }
    public String getName() {
        return name;
    }
public int count (){
return getP().getWord()*getPage();
}
}