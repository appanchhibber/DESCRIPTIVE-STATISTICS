import java.util.Timer;

public class Main {
/**
 * http://www.journaldev.com/1050/java-timer-timertask-example reference
 * @param args
 */
	public static void main(String[] args) {

		NumberGenerator numberGenerator = new NumberGenerator();
		Timer timer = new Timer(true);
		timer.schedule(numberGenerator, 0,10);
		System.out.println("TimerTask started");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("TimerTask cancelled");
		for(int a :numberGenerator.getDataSet()){
			System.out.println("ArrayList Member:"+a);
		}

	}

}
