package expackage;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		try {
//			int sum = 0;
//			for (String arg : args) {
//				sum += Integer.parseInt(arg);
//			}
//			System.out.println("Sum = " + sum);
//		} catch (NumberFormatException nfe) {
//			System.err.println("One of the command-line "
//					+ "arguments is not an integer.");
//		}
//		
		try{
			int num1 = 1, num2 = 1;
			try{
				num1 = Integer.parseInt(args[0]);
				num2 = Integer.parseInt(args[1]);
				System.out.println("End Nested Try Block");
			}
			catch (NumberFormatException e){
				e.printStackTrace();
			}
			System.out.println(num1/num2);
			
			System.out.println("End of Try Block");				
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java <MainClass> <first_number> <second_number>");
		}
		catch(ArithmeticException e){
			System.out.println("You cannot divide by zero");
		}
		catch(NumberFormatException e){
			System.out.println("Please provide valid numbers");
		}
		catch(Exception e){
			System.out.println("Unknown Error:" + e);
		}
		System.out.println("end");
	}
}
