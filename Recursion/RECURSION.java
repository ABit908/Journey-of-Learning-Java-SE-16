public class RECURSION {
    public static void main(String[] args) {
    int[] arr={2,4,6,7,43,50};
     int ans=search(arr,41,0, arr.length-1);
 System.out.println(ans);

    }
    static int search(int[] arr,int target,int s,int e)
    {
        if(e<s) return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
            return m+1;
        if(target<arr[m])
            return search(arr,target,s,m-1);
        else return search(arr,target,m+1,e);
    }
}
