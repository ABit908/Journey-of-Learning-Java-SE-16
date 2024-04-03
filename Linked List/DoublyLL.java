public class DoublyLL {
    private Node head;
    public void InsertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        if(head!=null)
            head.prev=node;
        node.prev=null;
        head=node;
    }
    public void InsertLast(int val)
    {
        Node node=new Node(val);
        Node temp=head;
        node.next=null;
        if(head==null) {
            node.prev=null;
            head = node;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;

    }
    public void Insert(int val,int idx)
    {
        Node node=new Node(val);
        if(idx==0) {
            InsertFirst(val);
            return;
        }
        Node temp=head;

        for(int i=1;i<idx;i++)
        {
            temp=temp.next;

        }
        if(temp.next==null) {
            InsertLast(val);
            return;
        }
        node.next=temp.next;
        node.next.prev=node;
        temp.next=node;
        node.prev=temp;

    }

//    public Node get(int idx)
//    {
//        Node temp=head;
//        for(int i=0;i<idx;i++)
//        {
//            temp=temp=
//        }
//    }

//    public Node find(int val)
//    {
//
//    }


    public void Display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;

        }
        System.out.println("END");

        // for reversing the linked list
//        while(last!=null)  //
//        {
//            System.out.print(last.val +" <-");
//            last=last.prev;
//        }
//        System.out.println("start");
  }

        private class Node {
            int val;
            Node prev;
            Node next;


            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;

            }
        }
    }

