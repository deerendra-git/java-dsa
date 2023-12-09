import java.util.Scanner;

public class SumOfNat {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter an natural number:");
        int x=scn.nextInt();
        sum(x);
    }
    static void sum(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            res+=i;
        }
        System.out.println(res);

    }
}