import java.util.*;
public class insertionSort {
    public static void InsersionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
              //insertion
               arr[prev+1]=curr;
        }
       
      

    }
     public static void sortedArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
   
    


    }

public static void main(String[] args) {
    int arr[]={4,2,5,1,2};
    InsersionSort(arr);
    sortedArr(arr);
}
}
