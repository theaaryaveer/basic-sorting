import java.util.*;
public class selectionSort {
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }



            }
            //swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
       
    }
         public static void sortedArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println();

    }
    

public static void main(String[] args) {
    int arr[]={3,2,4,5,1};
    SelectionSort(arr);
    sortedArr(arr);

}
}