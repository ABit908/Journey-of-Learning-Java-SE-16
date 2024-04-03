public class factusing_recursion {
    public static void main(String[] args) {
        int ans=fact(15);
        System.out.println(ans);
    }
    static int fact(int n)
    {
        int res=1;
        if(n>=1)
           res=n*fact(n-1);
        return  res;
    }
}
