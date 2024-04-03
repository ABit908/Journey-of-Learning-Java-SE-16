//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class seachingInArraylistUsing_Recursion {
//    public static void main(String[] args) {
//       int[] arr={1,3,5,5,5,6,7,8};
//       Arraylist<Integer> ans=findllIndex2(arr,5,0);
//       System.out.println(ans);
//    }
////    static Arraylist<Integer> findllIndex(int[] arr,int target,int index, Arraylist<Integer> list)
////    {
////        if(index==arr.length)
////            return list;
////        if(arr[index]==target)
////            list.add(index);
////        return findllIndex(arr,target,index+1,list);
////
////    }
//
//    static Arraylist<Integer> findllIndex2(int[] arr,int target,int index)
//    {
//        Arraylist<Integer> list=new Arraylist<>();
//        if(index==arr.length)
//            return list;
//        if(arr[index]==target)
//            list.add(index);
//        Arraylist<Integer> ansbelowCalls=findllIndex2(arr,target,index+1);
//        list.addAll(index);
//        return list;
//
//    }
//}
