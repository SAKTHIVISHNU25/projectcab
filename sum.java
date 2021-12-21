import java.util.*;
public class sum{
    public static void main(String[] args){
        int a,b,c,d;
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        c=a+b;
        d=a-b;
        System.out.println("the sum is: "+c);
    }
}