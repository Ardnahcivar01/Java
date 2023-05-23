public class array {
public static void main(String s[]){
    int arr[] = {12,1,2,4,554,445};
    
    int temp =0;
    // printing orignal array elements
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    // sorting an element in accending order
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // printing soted array 
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}    
}
