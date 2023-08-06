import java.util.*;
public class countingSort {
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++ ){
            largest = Math.max(arr[i], largest);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i =0; i<count.length; i++ ){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        

           
        }       }
 public static void sortedArr(int arr[]){
    for(int i=0; i<arr.length; i++){

        System.out.println(arr[i]);
            }
            System.out.println();       
         }
        
        

    public static void main(String[] args) {
        int arr[]={2,1,4,4,3,5,1};
        countingsort(arr);
        sortedArr(arr);
    }

}