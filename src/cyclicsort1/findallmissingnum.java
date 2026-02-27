package cyclicsort1;

import java.util.List;
import java.util.*;
public class findallmissingnum {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};

        System.out.println((missingnumberr(arr)));
    }
    public static List<Integer> missingnumberr(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<=arr.length&&arr[i]!=arr[correct]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}
