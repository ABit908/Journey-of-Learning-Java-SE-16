import static java.lang.Math.pow;

public class palindromeusing_Recursion {

        static int rev2(int num) {

            int digits=(int) (Math.log10(num)) + 1;

            return rev(num,digits);


        }
        private static int rev(int n,int digits)
        {
            if(n%10==n) {
                return n;
            }
            int rem=n%10;
            return rem*(int) pow(10,digits-1)+rev(n/10,digits-1);
        }
        static boolean aman(int n)
        {

                   return n==rev2(n);
        }
    public static void main(String[] args) {
        System.out.println(aman(6));

    }





    }

