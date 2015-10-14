/**
 * 
 */
package FlyFace;

/**
 * @author ilisze
 *
 */
public class Superman  extends Kryptonian implements Flyer{
	double height;
	int awesomeness;
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
	
	public void leapBuilding(){
		this.awesomeness = 1000;
	}
	
	public void stopBullet(){
		this.awesomeness = 10000;
	}

}
