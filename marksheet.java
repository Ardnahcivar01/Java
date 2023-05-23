import java.util.Scanner;

// class for marksheet 
class student {
    private String name, div;
    int roll_no;
    float hindi,eng,math,phy,chem;
    float total = 0, per;
    public Scanner sc = new Scanner(System.in);

    // function to get name of student
    void get_name() {
        System.out.print("Enter name of student : ");
        name = sc.nextLine();
    }

    void show_name() {
        System.out.println("Name is : " + name);
    }

    // function to get roll number of student
    void get_roll() {
        System.out.print("Enter roll number of " + name + " : ");
        roll_no = sc.nextInt();
    }

    void show_roll() {
        System.out.println("Roll number is : " + roll_no);
    }

    // Function to get marks
    void get_marks() {
        System.out.print("Enter marks of Hindi : ");
        hindi = sc.nextFloat();
        System.out.print("Enter marks of Englisg : ");
        eng = sc.nextFloat();
        System.out.print("Enter marks of physics : ");
        phy = sc.nextFloat();
        System.out.print("Enter marks of Maths : ");
        math = sc.nextFloat();
        System.out.print("Enter marks of Chemistry : ");
        chem = sc.nextFloat();
    }
    void show_marks(){
        System.out.println("               <--------------- MARKS ------------------>        ");
        System.out.println("Marks of Hindi is     : "+ hindi);
        System.out.println("Marks of English is   : "+ eng);
        System.out.println("Marks of Maths is     : " + math);
        System.out.println("Marks of Physics is   : "+ phy);
        System.out.println("Marks of Chemistry is : "+ chem);
    }

    // function to find total of marks
    void total_marks() {
        System.out.println("              <--------------- TOTAL MARKS ------------------>          ");
        total = hindi+eng+phy+chem+math;
        System.out.println("Total marks is : " + total);
    }

    // fuunction to find percentage 
    void percentage(){
        System.out.println("               <--------------- PERCENTAGE ------------------>          ");
        per = (total / 500 ) * 100;
        System.out.println("Percentage of student "+name+" is :"+per);
    }
    // function to show division of student
    void division(){
        System.out.println("               <--------------- DIVISION ------------------>            ");
        if(per> 100){
            System.out.println(" Not possible  ");
        }
        else if(per>=60 && per<= 100){
            System.out.println(name+" got --> " + "First division ");
        }
        else if(per>=50 && per<=60){
            System.out.println(name+" got --> " +" Second division ");
        }
        else if(per>=40 && per<=50){
            System.out.println(name+" got --> " +" Third division ");
        }
        else{
            System.out.println(name+" --> " +" Fail !! ");
        }
    }
}

public class marksheet {
    public static void main(String s[]){
         
      
        student st = new student();
        st.get_name();
        st.get_roll();
        st.get_marks();
        
        System.out.println("             <--------------- Marksheet ------------------>            ");
        st.show_name();
        st.show_roll();
        st.show_marks();
        st.total_marks();
        st.percentage();
        st.division();


    }
}
