package str.build.buff;

class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height
				+ ".";
	}
}

class getCharsDemo {

}

// Demonstrate equals() and equalsIgnoreCase().
class equalsDemo {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Good-bye";
		String s4 = "HELLO";
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
		System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> "
				+ s1.equalsIgnoreCase(s4));
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construct one String from another.
		char c[] = { 'J', 'a', 'v', 'a' };
		String s1 = new String(c);
		String s2 = new String(s1);

		System.out.println(s1);
		System.out.println(s2);
		String s = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];

		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}

}
