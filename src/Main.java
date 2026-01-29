import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted=true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sorted=false;
                }
            }
            if(sorted){
                break;
            }
        }
    }
}