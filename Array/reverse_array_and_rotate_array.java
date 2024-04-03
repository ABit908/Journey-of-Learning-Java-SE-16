//import java.util.Arrays;
//
//public class reverse_array_and_rotate_array {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        int[] ans=reverse(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(ans));
//    }
//    static int[] reverse(int[] arr,int i,int j)
//    {
//        // if arr is[1,2,3,4,5,6] then it will be [6,5,4,3,2,1]
//        while(i<j)
//        {
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        return arr;
//    }
//    static  int[] rotated(int[] arr,int d)
//    {
//        // if my arr is[1,2,3,4,5,6] and suppose d=3 then after rotated from dth position my new array will be [4,5,6,1,2,3]
//        for(int i=0;i<d;i++)
//        {
//            int temp=arr[0];
//            for(int j=1;j<arr.length-1;j++)
//            {
//                arr[j-1]=arr[d];
//                arr[j]=arr[]
//
//            }
//        }
//    }
//}
