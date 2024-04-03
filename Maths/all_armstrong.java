import java.util.Arrays;
import java.util.Scanner;

public class all_armstrong {
    public static void main(String[] args) {
//        int s=0;int c;
//        for(int i=1;i<1000;i++)
//        {
//            int k=i;
//            while(k>0)
//            {
//                c=k%10;
//                s=s+(c*c*c);
//                k=k/10;
//            }
//            if(s==i) System.out.println(i+" ");
//            s=0;
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
