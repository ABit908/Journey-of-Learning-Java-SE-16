public class fibnoacci_usingMemoAndTabular {
    // using Memorization
    public static int fibMemo(int n, int[] memo)
    {
        if(n<=1) return n;
        if(memo[n]!=0)
        {
            return memo[n];
        }
        memo[n]=fibMemo(n-1,memo)+fibMemo(n-2,memo);
        return memo[n];
    }
    public static int fibTabu(int n)
    {
        int [] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
            System.out.print(f[i] +" " );


        }
        System.out.println();
        return f[n];
    }

    public static void main(String[] args) {
        int n=7;
        int[] memo=new int[n+1];
        System.out.println( fibMemo(n-1,memo));
        System.out.println(fibTabu(n-1));

    }
}
