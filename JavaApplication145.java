
package javaapplication145;
public class JavaApplication145 {
    public static void main(String[] args) {
String S1="Welcome to Microsoft";
     String S2="Welcome to java";
     String S3=S2.substring(0, 1).toLowerCase() + S2.substring(1);
    System.out.println(S3);
    if(S3.startsWith("welcome"))
        System.out.println("S3 start with welcome");
    else
        System.out.println("S3 does not start with welcome");
    String S4=S1.substring(12, 20);
            for(int i=S4.length()-1;i>=0;i--)
                System.out.print(S4.charAt(i));  
    }
    
}
