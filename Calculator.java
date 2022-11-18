import java.util.*;
public class Calculator {
    Scanner scan=new Scanner(System.in);
    int x;
    int y;
    int z;
    public int add(){
        System.out.println("Enter two numbers to perform addition");
        x=scan.nextInt();
        y=scan.nextInt();
         z=x+y;
        return z;
    }
    public int subtract(){
        System.out.println("Enter two numbers to perform subtraction");
        x=scan.nextInt();
        y=scan.nextInt();
        z=x-y;
        return z;
    }
    public static void main(String[] args) {
        Calculator c= new Calculator();
        System.out.println(c.add());
        System.out.println(c.subtract());
    }
}
