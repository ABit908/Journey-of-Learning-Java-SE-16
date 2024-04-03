public class singlyLL {
    private  Node head;// by default head=null
    private Node tail; // by default tail=null
    private int size;
    private Node next;
    public singlyLL() //This line defines a constructor for the LL class, which initializes the linked list.
    {
        this.size=0;
    }
    public Node get(int idx)
    {
        Node node=head;
        for(int i=0;i<idx;i++)
        {
            node=node.next;
        }
        return node;
    }
    public Node find(int val)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==val)
                return node;
            node=node.next;
        }
        return null;
    }
    public void insertFirst(int val) //a method
    {
        Node node =new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size +=1;
    }
    public void insertLast(int val)
    {
        if(tail==null) {
            insertFirst(val);
            return ;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }


    public void insert(int val,int idx)
    {
        if(idx==0)
        {
            insertFirst(val);
            return;
        }
        if(idx==size)
        {
            insertLast(val);
            return;
        }

        Node currnode=head;
        for(int i=1;i<idx;i++)
        {
            currnode=currnode.next;
        }
        Node node=new Node(val,currnode.next);
        currnode.next=node;
        size++;

    }
    public int deleteFirst()
    {
        int val=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast()
    {
        if(size<=1)
            return deleteFirst();
        Node secondlast= get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }

    public int delete(int idx)
    {
        if(idx==0) return deleteFirst();
        if(idx==size-1) return deleteLast();
        Node prev=get(idx-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;

    }
    // insert in linkedlist using Recursion

    public void insertRec(int val,int index)
    {

        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next= insertRec(val,index-1,node.next);
        return node;
    }

    public void display() // a method
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void Mergesort(Node left, Node right)
    {

    }
    public void bubblesort(int row,int col)
    {
        if(row==0) return;
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);
            if(first.value> second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }

                bubblesort(row, col + 1);
            } else bubblesort(row-1,0);
        }

    }
    private  class Node //to represent individual nodes in the linked list.
    {
        private int value;
        private Node next;// by default next= null and next is pointing to other node so thats why its type is Node


        public Node(int value)//a constructor for the Node class, which initializes a node with a specified value.

        {
            this.value=value;
        }
        public Node(int value, Node next)// another constructor which allowing the initialization of both value and the reference to the next node
        {
            this.value=value;
            this.next=next;
        }
    }
}
