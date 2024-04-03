public class CircularLL {
    private  Node head;
    private Node tail;

    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void Cdelete(int val)
    {
        Node node=head;
        if(node==null)
            return;
        if(node.val==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node secondnode=node.next;
            if(secondnode.val==val)
            {
                node.next=secondnode.next;
                break;
            }
            node=node.next;
        } while (node!=head);
    }

    public void Cdisplay()
    {
        Node node=head;
        if(head!=null)
        {
            do{
                System.out.print(node.val + "->");
                node=node.next;
            } while(node!=head);
        }
        System.out.println("HEAD");
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
