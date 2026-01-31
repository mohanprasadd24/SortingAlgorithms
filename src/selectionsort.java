import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={4,9,2,1,3};
        selection(arr);
        System.out.print(Arrays.toString(arr));

    }

    static void selection(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int max=max(arr, 0,last);
            swap(arr, max,last);
        }
    }
    static int max(int[] arr,int start, int last){
        int max=start;
        for (int i = start; i <= last; i++) {
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
