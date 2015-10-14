package expackage;

class IllegalAgeException extends Exception{
	public String getMessage(){
		return "You need to be 18 or above to vote";
	}
}

class IllegalDrinkException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You can't drink that";
	}
	
}
class TestLaw{
	public void beAdult(int age) throws IllegalAgeException, IllegalDrinkException{
		if(age < 18){
			throw new IllegalAgeException();
		}
		else if(age < 21){
			throw new IllegalDrinkException();
		}
		else{
			System.out.println("You are eligible to partake");
		}
	}
}

public class CreateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLaw take_action = new TestLaw();
		try{
			take_action.beAdult(20);
		}
		catch(IllegalAgeException e1){
			e1.printStackTrace();
		}
		catch(IllegalDrinkException e2){
			e2.printStackTrace();
		}
	}

}
