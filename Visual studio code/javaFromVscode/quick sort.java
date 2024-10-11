import java.util.*;
class quickSort{
  static int step=0;
    public static void main(String [] arg ){
    int[] arr = {5, 3, 2, 1, 4};
  System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length-1);
    System.out.print(Arrays.toString(arr));
    System.out.print(step);
    }

 static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
    int pivot = arr[high ];

    int i=low-1;
    for(int j=low ;j<high;j++){
        if(pivot<arr[j]){
i++;
int temp=arr[i];
arr[i]=arr[j];
arr[j]=arr[i];}
    }
    int tem = arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=tem;
    step++;
    quickSort(arr, low, i);
    quickSort(arr, i+2, high);

  }    
}
}
// quick sort