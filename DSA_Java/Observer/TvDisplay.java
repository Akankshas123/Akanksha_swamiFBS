package p1;

public class TvDisplay implements Queueobserver{
	@Override
	public void update(Waitingqueue queue) {
		System.out.println("Tv display executed");
	}

}
