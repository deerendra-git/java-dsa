import java.util.Scanner;

//factorial of a given number
public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=scn.nextInt();
        int result=1;
        while(num>0){
            result*=num;
            num=num-1;

        }
        System.out.println(result);
    }
}