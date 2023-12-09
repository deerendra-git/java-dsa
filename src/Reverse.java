import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=scn.nextInt();
        int digit;
        while(num>0){
            digit=num%10;
            System.out.print(digit);
            num=num/10;
        }
    }
}