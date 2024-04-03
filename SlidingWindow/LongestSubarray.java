package SlidingWindow;

import java.util.Scanner;
import java.util.*;

// we have to find length and that subarray from given array whose sum is less or equal to k target.
public class LongestSubarray {
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]  nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int k=s.nextInt();//k is the target
       int x =BruteTechLongestLengthSubArray(nums,k);
        System.out.println(x);
        System.out.println(betterTechLongestLengthSubArray(nums,k));
//        for(int i=0;i< list.size();i++)
//        {
//            System.out.println(list.listIterator(i));
//        }
    }
    public static int BruteTechLongestLengthSubArray(int[] nums,int k)
    {
        int maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum<=k) {
                    if (maxlen < j - i + 1) {
                        maxlen = j - i + 1;
                        for (int K = i; K <=j; K ++) {
//                            if(!list.contains(nums[K]))list.add(nums[K]);
                        }
                    }
                }
                else if(sum>k) break;
            }
//            if(!list.contains(nums[i]))list.remove(nums[i]);

        }
        return maxlen;
    }
    public static int betterTechLongestLengthSubArray(int [] nums,int k)
    {
        int maxleng=0;
        int r=0;
        int l=0;
        int sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>k)
            {
                sum-=nums[l];
                l++;
            }
            if(sum<=k)
            {
                maxleng=Math.max(maxleng,r-l+1);
            }
            r++;
        }
        return maxleng;
    }
}
