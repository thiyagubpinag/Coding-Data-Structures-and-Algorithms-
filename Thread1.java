
public class Thread1 {

	int counter = 1;

	static int N;

	public void printEvenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notify();
			}
		}

	}

	public void printOddNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notify();

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		N = 10;

		Thread1 objNew = new Thread1();

		Thread t1 = new Thread(() -> {
			objNew.printEvenNumber();

		});

		Thread t2 = new Thread(() -> {
			objNew.printOddNumber();
		});

		Thread t3 = new Thread(() -> {
			objNew.printEvenNumber();
		});

		Thread t4 = new Thread(() -> {
			objNew.printOddNumber();
		});

		t1.start();
		t2.start();
		// t3.start();
		// t4.start();

		t1.join();
		t2.join();
		// t3.join();
		// t4.join();

		System.out.println("done");

	}

}
