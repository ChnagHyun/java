package ch14;

public class ThreadTwo extends Thread {
	 @Override
	   public void run() {
	      System.out.println(getName() + "시작됐습니다.");
	      try {
	         Thread.sleep(1000);
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }
	      System.out.println(getName() + "종료됐습니다.");
	   }

	   public static void main(String[] args) {
	      for (int i = 0; i <= 10; i++) {
	         Thread t = new ThreadTwo();
	         t.start();
	         try{
	            t.join();
	         }catch(InterruptedException e) {
	            e.printStackTrace();
	        }

	     }
	      
	  }

}
