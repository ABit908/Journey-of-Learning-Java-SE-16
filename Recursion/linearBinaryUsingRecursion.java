public class linearBinaryUsingRecursion {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,8,12,23,45,67};
        int ans=BinaryUR(arr,0,arr.length-1,0 );
        System.out.println(ans+1);
    }
    static int LinearUR(int[] arr,int idx,int target)
    {
        if(idx>=arr.length) return 0;
        else if(arr[idx]==target) return idx;
        else return LinearUR(arr,idx+1,target);
    }
    static int BinaryUR(int[] arr,int l,int high,int target)
    {
        int mid=l+(high-l)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) return BinaryUR(arr,mid+1,high,target);
        else return BinaryUR(arr,l,mid-1,target);
    }
}
