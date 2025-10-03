package p1;

public class Queuedisplay implements Queueobserver {
	public void update(Waitingqueue queue) {
		System.out.println("Current Waiting Line ("+queue.getSize()+" customer) : ");
		String[] customers= queue.getqueueElements();
		for(String c: customers) {
			System.out.println(c+ " ");
		}
		System.out.println("\n==============================");
	}
}
