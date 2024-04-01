package DIVIDE_CONQURE;

public class quick {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void Quicksort(int arr[] , int si ,int ei){
        // base case
        if(si >= ei){
            return ;
        }
        // kaam
         int pidx = parition(arr , si , ei);
         Quicksort(arr, si, pidx -1); // left
         Quicksort(arr, pidx +1, ei);  // right
    }
    public static int parition(int arr [], int si, int ei){
        int pivot = arr[ei];
        int i = si -1;
        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;

    }
    public static void main(String[] args) {
        int arr[] ={6 ,3 ,9 ,5,2,8};
        Quicksort(arr, 0, arr.length -1);
        printArr(arr);
        
    }
    
}
