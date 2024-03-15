package ch14;

public class ThreadThree  implements Runnable {
	   @Override
	   public void run() {
	      System.out.println(Thread.currentThread().getName() + " Start");
	      try {
	         Thread.sleep(1000);
	      } catch (Exception e) {
	      }
	      System.out.println(Thread.currentThread().getName() + " Stop");
	   }

	   public static void main(String[] args) {
	      
	      for (int i = 0; i <= 10; i++) {
	         Runnable t = new ThreadThree(); //구현 객체 생성
	         Thread thread = new Thread(t); //스레드 객체 생성
	         //Thread thread = new Thread(new ThreadThree());
	         thread.start();
	         try {
	            thread.join();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }

	   }

}
