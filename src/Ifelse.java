import java.util.Scanner;

public class Ifelse{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = scn.nextInt();
        if (salary>10000){
            salary=salary+2000;
        }
        else {
            salary=salary+1000;
        }
        System.out.println("Total salary is "+salary);


    }
}