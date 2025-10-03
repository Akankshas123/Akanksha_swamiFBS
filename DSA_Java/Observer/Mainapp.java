package p1;

public class Mainapp {
   public static void main(String[] args) {
	   WaitingQueueSubject WaitingQueue=new WaitingQueueSubject(5);
	   Queuedisplay queue=new Queuedisplay();
	   TvDisplay Tv=new TvDisplay();
	   
	   
	   WaitingQueue.addObserver(queue);
	   WaitingQueue.addObserver(Tv);
	   
	   WaitingQueue.CustomerArrives("raj");
	   WaitingQueue.CustomerArrives("akki");
	   WaitingQueue.CustomerArrives("sahil");
	   
	   WaitingQueue.Customerserved();
	   

	   WaitingQueue.CustomerArrives("aboli");
	   WaitingQueue.CustomerArrives("pooja");
	   WaitingQueue.CustomerArrives("mansi");
	   
	   WaitingQueue.Customerserved();
	   WaitingQueue.Customerserved();
	   WaitingQueue.Customerserved();
	   WaitingQueue.Customerserved();
	   WaitingQueue.Customerserved();
	   
	   WaitingQueue.Customerserved();
	   
   }
   
}
