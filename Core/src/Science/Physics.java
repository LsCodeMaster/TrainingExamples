/**
 * 
 */
package Science;

import math.Multiplication;


/**
 * @author ilisze
 *
 */
public class Physics extends Multiplication{
	final double GRAVITY = 9.81;
	String grade;
	public Physics(){
		super();
		this.grade = "B";

	}
	public void test(){
		System.out.println("Physics");
		return;
	}
	public double potentialEnergy(Physics data){
		data.num2 = 3;
		data.num3 = 4;
		return GRAVITY*data.num2*data.num3;
	}
}
