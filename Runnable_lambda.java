package assignmentone;

public class Runnable_lambda {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.println("Lambda Runnable in action!");
		});
		thread.start();
	}
}