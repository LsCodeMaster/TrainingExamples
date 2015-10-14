package ArrPack;

import java.util.Calendar;

/**
 * 
 */

/**
 * @author ilisze
 *
 */
public class MainApp {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HI");
		int num[]; //stack
		num = new int[10];
		int ref[];
		ref = num;
		num = new int[5];
		num[2] = 5;
		for(int element: num){
//			System.out.print(element);
		}
//		System.out.println("");

		int trplArr[][][] = new int[5][4][3];
		for (int x = 0; x < trplArr.length; x ++){
			for(int y = 0; y < trplArr[x].length; y++){
				for(int z = 0; z < trplArr[x][y].length; z++){
					trplArr[x][y][z] = x + y + z;	
				}
			}
		}
		
		for(int xArr[][] : trplArr){
			for(int xyArr[] : xArr)
			{
				for(int xyzElem : xyArr){
					//System.out.print(xyzElem);					
				}
//				System.out.println();
			}
//			System.out.println();
//			System.out.println();
		}
		
		Point p1 = new Point();
		Point[] p2 = null;
		p2 = p1.createArray();
		Point[] p3 = new Point[10];
		System.arraycopy(p2, 0, p3, 0, p2.length);
	}
	
	
	

}
