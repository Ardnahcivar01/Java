// Java program to find the qudatric equation result either positive , negative or zero
public class quad {
    public static void main(String s[]){
       
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        if(((b*b)-4*a*c)<0){
            System.out.println("Solution of Quadtric equation is negative ((Then not possible )) !! ");
        }
        else if(((b*b)-4*a*c)>0)
        {
            int eq = ((b*b)-4*a*c);
            System.out.println("Positive then solution is : "+eq);
        }
        else{
            System.out.print("solutioin of Quadtric equation is Zero(0) !!");
        }
    }
    
}
