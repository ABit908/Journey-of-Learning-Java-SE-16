import java.util.*;

public class Binary_Tree {
    static class Node {
        int data;
           Node left;
           Node right;
          public Node()
           {

           }

           Node(int value) {
               data = value;
               left = null;
               right = null;
           }
       }
       static class Pair
       {
           Node head;
           Node tail;
       }

       static   Node CreateSampleBTree()
            {
                Node root=new Node (5);
                root.left=new Node(3);
                root.right=new Node(10);
                root.left.left=new Node(1);
                root.left.right=new Node(4);
                root.right.left=new Node(8);
                root.right.right=new Node(20);
                root.right.left.right=new Node(9);
                return root;
            }
          public static void PreOrder(Node r)
            {
                if(r==null) return;
                System.out.print(r.data + " ");
                PreOrder(r.left);
                PreOrder(r.right);
            }
    public static void inOrder(Node r)
    {
        if(r==null) return;
        inOrder(r.left);
        System.out.print(r.data + " ");
        inOrder(r.right);
    }
    public static void postOrder(Node r)
    {
        if(r==null) return;
        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.data + " ");
    }
    static void PrintLeafNode(Node root)
    {
        if(root == null) return ;
        if(root.left==null&&root.right==null) System.out.print(root.data + " ");
        PrintLeafNode(root.left);
        PrintLeafNode(root.right);
    }
   static  boolean Search(Node root,int val)
    {
        if(root==null) return false;
        if(root.data==val) return true;
       return Search(root.left,val)||Search(root.right,val);
    }
    static int getLevel(Node root,int val,int i)
    {

        if(root==null) return -1;
        if(root.data==val) return i;
       int a=getLevel(root.right,val,i+1);
       if(a!=-1) return a;
       else
       return getLevel(root.left,val,i+1);
    }
    static boolean PrintAncestor(Node root,int val)
    {
        if(root==null) return false;
        if(root.data==val) return true;
        boolean l=PrintAncestor(root.left,val);
        if(l==true)
        {
            System.out.print(root.data + " ");
            return true;
        }
        if(l!=true)
        {
            boolean r=PrintAncestor(root.right,val);
            if(r==true)
            {
                System.out.print(root.data + " ");
                return true;
            }
        }
        if(PrintAncestor(root.left,val)==true||PrintAncestor(root.right,val)==true)
        {
            System.out.print(root.data + " ");
            return true;
        }
        return false;
    }
    static Pair res;
    static Pair TreeToList(Node r)
    {  ;
        if(r==null) return res;
        if(r.left!=null)
        {
            Pair L=TreeToList(r.left);
            L.tail.right=new Node();
            L.tail.right=r;
            r.left=L.tail;
            res.head=L.head;
        }
        else res.head=r;
        if(r.right!=null)
        {
            Pair R=TreeToList(r.left);
            R.head.left=new Node();
            R.head.left=r;
            r.right=R.head;
            res.tail=R.tail;
        }
        else res.tail=r;
        return res;

    }

    public static void LevelorderTraverse(Node root)
    {   if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {

            Node temp=q.remove();
            System.out.print(temp.data + " ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);

        }

    }
    public static void main(String[] args)
        {
            Node a=CreateSampleBTree();
            System.out.print("PREORDER:");
           PreOrder(a);
            System.out.println();
            System.out.print("INORDER:");
            inOrder(a);
            System.out.println();
            System.out.print("POSTORDER:");
            postOrder(a);
            System.out.println();
            System.out.print("AllLeafNodeInTree:");
            PrintLeafNode(a);
            System.out.println();
           boolean b= Search(a,9);
            System.out.print("Search the data 9 is present in Tree or not:" + b);
            System.out.println();
            int p=getLevel(a,9,0);
            System.out.print("The level of data 9 is:" + p);
            System.out.println();
            System.out.print("The Ancestor of 9 are:");
            PrintAncestor(a,9);
            System.out.println();
           Pair P= new Pair();
           P=TreeToList(a);
           System.out.println();
            System.out.println("The B.tree look like:" + P);
        }
}
