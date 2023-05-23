public class fibo1 {
    public static void main(String s[]) {
        int num = Integer.parseInt(s[0]);

        if(num==1)
        {
            System.out.println(1);
        }
        else if(num==2){
            System.out.println(1);
            System.out.println(1);
        }
        else{
            int a = 1,b=1,c;
            System.out.println(1);
            System.out.println(1);
            
            for(int i=0;i<num;i++){
                  c = a+b;
                  System.out.println(c);
                  a = b;
                  b = c;
            }
        }
    }
}
