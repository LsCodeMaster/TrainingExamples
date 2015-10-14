package assign;

//Average an array of values.
class Average {
	public static void main(String[] args) {
		double[] nums = { 10.1, 11.2, 12.3, 13.4, 14.5 };
		double result = 0;
		int curNum;

		for (int currNum = 0; currNum < nums.length; currNum++) {
			result = result + nums[currNum];
		}
		System.out.println("Average is " + result / nums.length);
	}
}