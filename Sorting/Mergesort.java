import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr={4,5,2,7,6,9,1};
        int[] ans=mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergesort(int[] arr)
    {
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergesort(Arrays.copyOfRange(arr,mid+1,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[]left,int[]right) {
        int[] mix = new int[left.length + right.length];
        int i, j, k;
        i = j = k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
            while (i < left.length) {
                mix[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                mix[k] = right[j];
                j++;
                k++;
            }

        }
        return mix;
    }

}
