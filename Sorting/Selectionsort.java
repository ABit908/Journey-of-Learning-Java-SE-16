import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
       int[] arr={4,3,1,2,8,5};
       Selsectionsorting(arr);
       Bubble(arr);
       System.out.println(Arrays.toString(arr));
        Bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Selsectionsorting(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int last=arr.length-i-1;
            int maxindex=Maxindex( arr,0,last);
            swap(arr,maxindex,last);
        }

    }

    private static void swap(int[] arr, int m, int n) {
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;

    }

    private static int Maxindex(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++)
        {

            if(arr[max]<arr[i]) max=i;

        }
        return max;
    }
    static void Bubble(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
    }
}
