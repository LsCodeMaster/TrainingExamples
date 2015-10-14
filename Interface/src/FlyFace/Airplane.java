package FlyFace;

public class Airplane extends Vehicle implements Flyer{
	double height;

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		this.height = 0.1;
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		this.height = 0;
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		this.height = Math.random()*10000000 + 0.1;
	}
}
