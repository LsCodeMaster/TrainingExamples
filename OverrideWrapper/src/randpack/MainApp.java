package randpack;

class Data{
	private int firstNumber;
	private int secondNumber;
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Data dObj;
		if((obj instanceof Data) && (obj != null))
			dObj = (Data)obj;
		else 
			return false;
		return (this.getFirstNumber() == dObj.getFirstNumber())
				&&(this.getSecondNumber() == dObj.getSecondNumber());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.setFirstNumber(2);
		d1.setSecondNumber(4);
		d2.setFirstNumber(2);
		d2.setSecondNumber(4);
		Object obJob = new Object();
		Data d = null;
		System.out.println(d1.equals(obJob));
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d));
	}

}
