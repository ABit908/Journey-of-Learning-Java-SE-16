import java.util.Scanner;

public class armstrong {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no to check whether the number is Armstrong or not ");
       int  n= in.nextInt();
        ArmStrong(n);

    }
    static void ArmStrong(int n)
    {
        int s=0;
        int c;
        int k=n;
        while(n>0){
             c=n%10;
            s+=c*c*c;
            n=n/10;
        }
        if(k==s){
            System.out.print("no. is armstrong");
        }
        else System.out.print("not armstrong");

    }
}
