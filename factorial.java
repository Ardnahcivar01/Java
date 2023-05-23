// Java program to find the factorial of the number using recursion approach
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        if(n==1)
        {
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        int result  = fact(num);
        System.out.println("factorial of "+num+ " is : "+result);
    }
}
