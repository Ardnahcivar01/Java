// Program to understand the concept of the class java programming 
import java.util.Scanner;
class emp{
    String name ;
    float marks[] = new float[5];
    float total=0,per;
    int roll_no;
     Scanner sc = new Scanner(System.in);
public 
   void getname(){
    
    System.out.println("Enter name of student");
    name = sc.nextLine();
    System.out.println("Name of student is "+name);

   }

   void getroll(){
    System.out.println("Enter roll number : ");
    roll_no = sc.nextInt();
    System.out.println("Roll number of "+ name +" is " +roll_no);
   }

   void marks(){
    System.out.println("Enter  marks of five subject");
    for(int i=0;i<5;i++){
        marks[i] = sc.nextFloat();
        // total = total+marks[i];
    }
   }
   void total_marks(){
    for (int i=0;i<5;i++){
        total+=marks[i];
    }
    System.out.println("Total number is : "+total);
   }
   void percentage(){
    per = total /500 * 100;
    System.out.println("Percentage is : "+per);
   }
   
}
public class class1{
    public static void main(String s[]){
        emp cl = new emp();
        cl.getname();
        cl.getroll();
        cl.marks();
        cl.total_marks();
        cl.percentage();
    }
}
