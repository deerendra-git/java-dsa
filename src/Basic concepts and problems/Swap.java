import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        swap();
    }
    static void swap(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers to swap: ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+"  "+b);
    }
}