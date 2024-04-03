public class SearchingInSortedArray_Recursion {
    public static void main(String[] args) {
        int[] arr={4,5,6,8,0,1,2,3};
        int ans=search(arr,4,0, arr.length-1);
        System.out.println(ans+1);
    }
    static int search(int[] arr,int target,int s,int e)
    {
        int mid=s+(e-s)/2;
        if(s>e) return -1;
        if(target==arr[mid]) return  mid;
        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s]&&target<=arr[mid]) return search(arr,target,s,mid-1);
            else return search(arr,target,mid+1,e);
        }
        if(target>=arr[mid]&&target<=arr[e]) return search(arr,target,mid+1,e);
        else return search(arr,target,s,mid-1);
    }
}
