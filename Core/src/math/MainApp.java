/**
 * 
 */
package math;

import Science.Physics;

/**
 * @author ilisze
 *
 */
public class MainApp{
	private int i=1;
	
	public void firstMethod(){
		int i=4, j=5;
		this.i = i + j;
		secondMethod(7);
	}
	
	public void secondMethod(int i){
		int j = 8;
		this.i = i + j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp scope = new MainApp();
		scope.firstMethod();
		System.out.println(scope.i);
		
		Multiplication x = new Multiplication();
		Multiplication t;
		t = x;
		Multiplication z = new Physics();
		System.out.println(t == x);
	}

	
}
