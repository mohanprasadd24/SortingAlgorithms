package cyclicsort1;

public class missingnumber {
    public static void main(String[] args) {
        int []arr={0,1,2,4};
        int missnum=missingnumberr(arr);
        System.out.println(missnum);
    }
    public static int missingnumberr(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr.length&&arr[i]!=arr[arr[i]]){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
