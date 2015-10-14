/**
 * 
 */
package enumEx;

/**
 * @author ilisze
 *
 */
enum Apple {

	Jonathan("Mmmm Jonathans"), GoldenDel("Gimme that gold"), RedDel("Make it Reds Apple Ale"), 
	Winesap("Gimme wine, I'll get sappy"), Cortland("Lets go to court");
	
	private String words;

	//Constructor
	Apple(String p) {words = p;}
	
	String getStrng() {return words;}
}


public class MainApp {

	public static void main(String[] args){
		Apple ap;
		System.out.println("Here are all Apple constants");
		
		Apple allApples[] = Apple.values();
		for(Apple a : allApples){
			System.out.println(a);
		}
		
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
		System.out.println();
		
		//Display strings associated with winesap
		System.out.println("Winesap catchphrase: " + Apple.Winesap.getStrng());
		
		System.out.println("All apple phrases: ");
		for(Apple a : Apple.values()){
			System.out.println(a + " - " + a.getStrng());
		}
	}
}

