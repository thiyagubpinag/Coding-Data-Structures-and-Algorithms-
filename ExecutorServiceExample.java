import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnableTask = () -> {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println("Current time :: " + LocalDateTime.now());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(10);

		// 1. execute task using execute() method
		executor.execute(runnableTask);

		// 2. execute task using submit() method
		Future<String> result = executor.submit(runnableTask, "DONE");

		while (result.isDone() == false) {
			try {
				System.out.println("The method return value : " + result.get());
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Sleep for 1 second
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Shut down the executor service
		executor.shutdownNow();

	}

}
