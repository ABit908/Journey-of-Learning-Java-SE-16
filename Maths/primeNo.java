import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1) System.out.print("not prime");
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0) {System.out.print("not prime"); c++;}
            if(c*c>n) System.out.print(" prime");
            else System.out.print("not prime");
        }
    }
}
