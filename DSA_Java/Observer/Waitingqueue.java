package p1;

public class Waitingqueue {
    private String[] queue;
    private int front,rear,size,capacity;
	
	public Waitingqueue(int capacity) {
		
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.capacity = capacity;
		this.queue = new String[capacity];
	}
	
	  
	public String[] getQueue() {
		return queue;
	}
	public void setQueue(String[] queue) {
		this.queue = queue;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRaer() {
		return rear;
	}
	public void setRaer(int raer) {
		this.rear = rear;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

    
    public void enqueue(String customer) {
    	if (isFull()) {
    		System.out.println("queue is full Customer \"+customer+\" cannot be added.");
    		return;
    	}
    	rear=(rear+1)%capacity;
    	queue[rear]=customer;
    	size++;	
    }
    
    
    public String dequeue() {
    	
		if(isEmpty()) {
    		System.out.println("queue is empty");
    		return null;
    	}
    	String customer= queue[front];
    	front=(front+1)%capacity;
    	size--;
    	return customer;
    }
    
    public String[] getqueueElements() {
    	String[] elements=new String[size];
    	for(int i=0;i<size;i++) {
    		elements[i]=queue[(front+1)%capacity];
    		
    	}
    	return elements;
    }




	
}
