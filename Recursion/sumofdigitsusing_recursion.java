public class sumofdigitsusing_recursion {
    public static void main(String[] args) {
        int ans=sum(2345);
        System.out.println(ans);
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem=n%10;
        n=n/10;
        return rem+sum(n);
    }
}
