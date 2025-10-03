package p1;

import java.util.ArrayList;
import java.util.List;

public class WaitingQueueSubject {
     private Waitingqueue queue;
     private List<Queueobserver> observers;
     
     public WaitingQueueSubject(int capacity) {
    	 queue=new Waitingqueue(capacity);
    	 observers =new ArrayList<>();
     }
     
     public void addObserver(Queueobserver observer) {
    	 observers.add(observer);
     }
     
     public void removeObserver(Queueobserver observer) {
    	 observers.remove(observer);
     }
     
     private void notifyObservers() {
    	 for(Queueobserver observer:observers) {
    		 observer.update(queue);
    	 }
     }
     
     public void CustomerArrives(String customer) {
    	 queue.enqueue(customer);
    	 System.out.println("customer "+customer+" arrived.");
    	 this.notifyObservers();
     }
     
     public void Customerserved() {
    	 String servedcustomer=queue.dequeue();
    	 if(servedcustomer!=null) {
    		 System.out.println("Customer "+servedcustomer+" served and left.");
 			this.notifyObservers();
    	 }
     }
     
     public int getQueueSize() {
    	 return queue.getSize();
     }

}
