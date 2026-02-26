import java.util.*;
public class cyclicsort {
    public static void main(String[] args) {
          int[]arr={3,5,2,1,4};
          cyclicsortt(arr);
          System.out.print(Arrays.toString(arr));
    }
    static void cyclicsortt(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
//            because need to complete at single loop.
             if(arr[i]!=arr[correct]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }

        }
    }
}
