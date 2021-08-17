package Practice;

public class ArrayQueue {
	private int data[];
	int size;
	int rear;
	int front;
	
	public ArrayQueue(int n)
	{
	data=new int[n];
	size=0;
	front=0;
	rear=0;
	}
	
	public int length()
	{
		return size;
	}
    public boolean isEmpty()
    {
    	return size==0;
    }
    public boolean isFull()
    {
    	return size==data.length;
    }
    
    public void insert(int e)
    {
    	if(isFull())
    	{
    		System.out.println("Queue is full.");
    	}
    	else
    	{
    		data[rear]=e;
    		rear=rear+1;
    		size=size+1;
    	}
    }
    
    public int delete()
    {
    	if(isEmpty())
    	{
    		System.out.println("Queue is empty.");
    		return -1;
    	}
    	else
    	{
    		int e=data[front];
    		front=front+1;
    		size=size-1;
    		return e;
    	}
    }
    
    public void display()
    {
    	for(int i=front;i<rear;i++)
    	{
    		System.out.print(data[i]+"--");
    	}
    	System.out.println("\n");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayQueue Q=new ArrayQueue(5);	
       Q.insert(10);
       Q.insert(12);
       Q.insert(11);
       Q.display();
     System.out.println("removed :"+Q.delete());
      
	}

}
