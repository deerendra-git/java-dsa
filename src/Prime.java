import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 natural numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        for(int i=a;i<=b;i++) {
            if (prime(i)) System.out.println(i + " ");
        }
    }
    static boolean prime(int n){
            if(n==0||n==1) return false;
            if(n==2) return true;
            for(int c=2;c*c<n;c++){
                if(n%c==0) return false;
            }return true;
        }
    }
