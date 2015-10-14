package assign;

//Compute the area of a circle.
class Area {
	final static double PI = 3.1416; // pi, approximately
	final static double RADIUS = 10.8; // radius of circle
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double area;


		area = PI * RADIUS * RADIUS; // compute area

		System.out.println("Area of circle is " + area);
	}
}