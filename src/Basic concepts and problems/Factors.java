import java.util.Scanner;

//Input a number and print all the factors of that number (use loops)
public class Factors {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=scn.nextInt();
        int flag=(num+1)/2;
        System.out.println("Factors are: ");
        for(int i=1;i<=flag;i++){
            if(num%i==0) System.out.println(i);
            else continue;
        }
    }
}