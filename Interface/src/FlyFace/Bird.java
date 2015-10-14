/**
 * 
 */
package FlyFace;

/**
 * @author ilisze
 *
 */
public class Bird extends Animal implements Flyer{
	double height;
	int children;
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
	
	public void layEggs(){
		this.children = (int)Math.random()*7;
	}
	
	public void eat(){
		this.children = 0;
		this.food -= 1;
	}
}
