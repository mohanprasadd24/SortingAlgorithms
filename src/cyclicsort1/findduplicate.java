package cyclicsort1;

public class findduplicate {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
        int missnum=missingnumberr(arr);
        System.out.println(missnum);
    }
    public static int missingnumberr(int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]<=arr.length&&arr[i]!=arr[arr[i]-1]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        int ans=0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                ans = arr[index];
            }
            else{
                ans=-1;
            }
        }
        return ans;
    }
}
