package ch14;

class MyClass {
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	public synchronized void decrement() {
		count--;
	}
	public void getCount() {
		System.out.println("count: " + count);
	}
}

public class ThreadFour {
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		
		Thread tadd = new Thread(new Runnable() {
			
			@Override
			public void run() {			
			for(int i =0 ; i < 10000 ; i ++) {
				mc.increment();
			}
		}
	});
		
		Thread tmin = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0 ; i < 10000 ; i++) {
					mc.decrement();
					
				}
			}
		});
	
		tadd.start();
		tmin.start();
		try {
			tadd.join();
			tmin.join();
		}catch (InterruptedException e) {
		}
		mc.getCount();
	}
}
