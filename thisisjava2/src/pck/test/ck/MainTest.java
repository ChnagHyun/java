package pck.test.ck;

public class MainTest {
	public void main(String[] args) {
		System.out.printf("args.length: %d\n", args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
