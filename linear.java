// Java program for linear search 
public class linear {
    public static int linear(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;

    }
    public static void main(String s[]){
        int[] arr = {1,2,3,4,5};
        int key =Integer.parseInt(s[0]);
        System.out.println(key+" Found in arrray at index : "+linear(arr,key));
    }
}
