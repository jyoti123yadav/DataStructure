package Queue;

public class Queue {
	
	private static int front, rear, capacity; 
    private static int queue[];
	
	Queue(int c)
	{
	 front=0;
	 rear=0;
	 capacity=c;
	}
	
	
	
	static void enqueue(int data)
	{
		if(capacity==rear)
		{
			System.out.println("queue is full ");
		}
		
		else
		{
			queue[rear]=data;
			rear++;
		}
	}
	
	
	
	static void dequeue()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		
		else
		{
			int i;
			for (i=0;i<rear-1;i++);
			{
				queue[i]=queue[i+1];
			}
			
			if(rear<capacity)
			{
				
				queue[rear]=0;
				rear--;
			}
		}
	}
	
	static void queueDisplay()
	{
		int i;
		if(front==rear)
		{
			System.out.println("queue is empty");
			return;
		}
		
		for(i=front;i<rear;i++)
		{
			System.out.printf("queue",queue[i]);
		}
		
		return;
	}
	
	
	static void queueFront()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		
		System.out.printf("Queue frot",queue[front]);
	}
	

	
	public static void main(String[] args) {
		
	Queue x=new Queue(4);
	x.enqueue(20);
	x.enqueue(30);
	x.enqueue(40);
	x.enqueue(50);

	x.queueDisplay();
	x.queueFront();
	
		
		
		
	}
	
	
	

}
