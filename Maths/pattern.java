public class pattern {
    public static void main(String[] args) {
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//    }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0||j==0||j==4||i==2)
                    System.out.print("* ");
                else  System.out.print("  ");
            }
            System.out.print("\n");
        }


 }
}
