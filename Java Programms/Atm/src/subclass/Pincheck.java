package subclass;

public class Pincheck {
	Boolean b= false;
	public Boolean pincheck(int pin) {
	
	switch(pin) {
	case 1111:
		b=true;
		break;
	case 2222:
		b=true;
		break;
	case 3333:
		b=true;
		break;
	case 44444:
		b=true;
		break;
	default:
		System.out.println("Invalid pin");
		
	}
    return b;
}
}