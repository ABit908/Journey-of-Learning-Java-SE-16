package SlidingWindow;

import java.util.Scanner;

public class ConstantWindow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]  nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int k=s.nextInt();//k is size of window
        int x=Maxmimumsum(nums,k);
        System.out.println(x);
    }
    public static int Maxmimumsum(int[] nums,int k)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int maxSum=sum;
        int l=0;
        int r=k-1;
        while(r<nums.length-1)
        {

            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
