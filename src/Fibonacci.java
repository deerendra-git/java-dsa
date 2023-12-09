import java.util.Scanner;

public  class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count <= n){
            int temp=b;
            b=b+a;
            a=temp;
            System.out.println(b);
            count++;
        }
       // System.out.println(b);
    }
}