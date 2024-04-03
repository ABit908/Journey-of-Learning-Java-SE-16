public class counting_no_Zeroes_using_Recursion {
    public static void main(String[] args) {
        System.out.println(count(15050530,0));

    }
    static int count(int n, int count)
    {
        if (n%10==n) {
            return count;
        }
        int rem=n%10;
        if(rem==0){
          return   count(n/10,count+1);
        }
        else return count(n/10,count);

    }

}
