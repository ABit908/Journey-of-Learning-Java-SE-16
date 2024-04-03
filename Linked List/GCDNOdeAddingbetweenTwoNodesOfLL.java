import java.util.*;
public class GCDNOdeAddingbetweenTwoNodesOfLL {
    // You are using Java


        public static void main(String[] args)
        {
            Node head=null;
            Node ptr=null;
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                if(head==null)
                {
                    head=new Node(s.nextInt());
                    ptr=head;
                }
                else {
                    ptr.next=new Node(s.nextInt());
                    ptr=ptr.next;
                }
            }
            // while(head!=null)
            // {
            //     System.out.print(head.data +"->");
            //     head=head.next;
            // }
            Node temp=head;
            while(head.next!=null)
            {
                int a=head.data;
                int b=head.next.data;
                Node temp2=head.next;
                Node newNode=new Node(gcd(a,b));

                head.next=newNode;
                newNode.next=temp2;
                head=head.next.next;
            }
            while(temp!=null)
            {
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
        }
        public static int gcd(int a,int b)
        {
            int i=a<b?a:b;
            for( i=i;i>1;i--)
            {
                if(a%i==0&&b%i==0) return i;
            }
            return 1;
        }
    }
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
            this.next=null;
        }

}
