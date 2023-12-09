import java.util.*;
import java.io.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 3 digit integer:");
        int num=scn.nextInt();
        int original,remainder,result;
        /*123=((123/1)%10)3+((123/10)%10)3+((123/100)%10)3*/
        original=num;
        result=0;
        while(original!=0){
            remainder=original%10;
            result+=Math.pow(remainder,3);
            original/=10;
        }
        if(result==num) System.out.println("The number is an armstrong number.");
        else System.out.println("It is not an armstrong number.");


    }
}