/**
 * 
 */
package math;

/**
 * @author ilisze
 * This class is for math operations
 */
public class Multiplication {
	int num1;
	protected int num2;
	public int num3;
	private int num4;
	
	public Multiplication(){
		this.num1 = 1;
		this.num2 = 2;
		this.num3 = 3;
		this.num4 = 4;
	}
	/**
	 * This method gives the sum of two numbers
	 * @param num1 - number 1 to be added
	 * @param num2 - number 2 to be added
	 * @return sum of 3 numbers
	 */
	public int mult(int num1, int num2){
		return num1*num2;
	}
	public void test(){
		System.out.println("Multiplication");
		return;
	}
}
