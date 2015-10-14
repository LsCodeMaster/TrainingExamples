package threadpackage;

class Data{
	private int value;
	
	public void getValue(){
		System.out.println(value);
	}
	
	public void setValue(int value){
		this.value = value;
	}
}
class Runner implements Runnable{
	Data data;
	private Thread secondThread;
	public Runner(){
		data = new Data();
	}
	public void dataNotify(){
		data.notify();
	}
	@Override
	public void run() {
		Thread currThread;
		// TODO Auto-generated method stub
		for(int counter = 0; counter < 10; counter++){
			currThread = Thread.currentThread();
			if(currThread.getName().equals("Producer")){
				System.out.println(currThread);
				synchronized (data){
					data.setValue(counter+1);	
					try{
						if(!secondThread.isAlive()){
							secondThread.start();
						}
						data.notify();
						data.wait();
						if(counter == 9){
							data.notify();
						}
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}				
				}
			}
			else if(currThread.getName().equals("Consumer")){
				System.out.println(currThread);
				synchronized(data){
					data.getValue();
					try{
						data.notify();
						data.wait();
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void setSecondThread(Thread secondThread) {
		// TODO Auto-generated method stub
		this.secondThread = secondThread;
	}
	
}
public class MainThreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Every Java Application is at least single threaded

		Runner runner = new Runner();
		
		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");
		firstThread.start();
		runner.setSecondThread(secondThread);

		
		System.out.println("The End");
	}

}
