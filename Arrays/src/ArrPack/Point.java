/**
 * 
 */
package ArrPack;

/**
 * @author ilisze
 *
 */
public class Point {
	int xDim;
	int yDim;
	public Point(int num1, int num2){
		this.xDim = num1;
		this.yDim = num2;
	}
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point[] createArray(){
		Point[] p;
		p = new Point[10];
		for(int i=0; i<10; i++){
			p[i] = new Point(i, i+1);
		}
		return p;
	}
}
