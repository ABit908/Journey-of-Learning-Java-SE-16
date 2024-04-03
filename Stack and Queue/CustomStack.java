public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    CustomStack(int size)
    {
        this.data=new int[size];//note: in this line size is taken of data of type array
    }

    public boolean push(int item)throws Exception
    {
        if(isFull()){
           throw new Exception("stack is full already");

        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException
    {
        if(isEmpty()){
            throw new StackException("cannot pop from empty stack");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws Exception// data at the peak
    {
        if(isEmpty()){
            throw new Exception("cannot peek from empty stack");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
}
