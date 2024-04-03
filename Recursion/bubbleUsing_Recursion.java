public class bubbleUsing_Recursion {
    public static void main(String[] args) {

    }
    static void bubble(int[] arr,int r,int c)
    {
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;

            }
            bubble(arr,r--,c++);
        }
    }
}
