import java.util.*;
public class OddOrEven{
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number to check odd or even");
        int x=scan.nextInt();

        if(x>=0){
            System.out.println("entered number is even number");
        }else{
            System.out.println("entered number is odd number");
        }
    }
}