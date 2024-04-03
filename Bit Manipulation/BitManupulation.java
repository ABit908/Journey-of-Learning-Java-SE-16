import java.util.ArrayList;
import java.util.Scanner;

public class BitManupulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> ans=solutionofGreyCode(n);
        for(String s:ans)
        {
            for(int i=0;i<s.length();i++)
            {
                System.out.print(s.charAt(i) + " " );
            }
            System.out.println();
        }
    }

    public static ArrayList<String> solutionofGreyCode(int n) {
        if(n==1){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        ArrayList<String> rres=solutionofGreyCode(n-1);
        ArrayList<String> mres= new ArrayList<>();
        for(int i=0;i<rres.size();i++)
        {
            String s=rres.get(i);
            mres.add("0" + s);
        }
        for(int i=rres.size()-1;i>=0;i--)
        {
            String s=rres.get(i);
            mres.add("1" + s);
        }
        return mres;
    }
}
