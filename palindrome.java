// Program to calculate the palindrome number in java 
import java.util.Scanner;
public class palindrome {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int sum =0,r,temp;
        temp = num;
        while(num>0){
            r = num%10;
            sum =(sum*10)+r;
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("NUmber is not palindrome");
        }
    }
}
