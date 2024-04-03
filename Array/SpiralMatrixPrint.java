import java.util.Scanner;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int[][] arr=new int[4][4];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                arr[i][j]=sc.nextInt();
        PrintMatrix(arr);

    }
    public static void PrintMatrix(int[][] a)
    {
        int sr=0;
        int sc=0;
        int er=a.length-1;
        int ec=a[0].length-1;
        int i;
        while(sr<=er&&sc<=ec)
        {
            for(i=sc;i<=ec;i++)
                System.out.println(a[sr][i]);
            for(i=sr+1;i<=er;i++)
                System.out.println(a[i][ec]);
            for(i=ec-1;i>=sc;i--)
                System.out.println(a[er][i]);
            for(i=er-1;i>=sr+1;i--)
                System.out.println(a[i][sc]);
            sr++;
            sc++;
            ec--;
            er--;
        }
    }
}
