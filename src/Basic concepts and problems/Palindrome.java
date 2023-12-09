import java.util.Scanner;
import java.lang.String;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scn.nextLine().trim();
        int len=str.length();
        int i;
        for(i=0;i<=len/2;i++) {
            if (str.charAt(i) == str.charAt(len - i - 1)) continue;
            else break;
        }
        if(i==len/2 || i==(len+1)/2) {
            System.out.println("Given string is a palindrome.");
        }else{
            System.out.println("Given string is not a palindrome.");
        }
    }
}