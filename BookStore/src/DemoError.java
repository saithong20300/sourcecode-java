
public class DemoError {
	public static void main(String[] args) {
		DemoError e = new DemoError();

	//	System.out.println(e.processProactive(0));
		System.out.println(e.processReactive(0));
	}

	double processReactive(int input) {
		try {
			return 10 / input;
		} catch (ArithmeticException a) {
			//a.printStackTrace();
		}
		return -1;
	}

	double processProactive(int input) {
		// fail fast
		if (input == 0) {
			return -1;
		}
		return 10 / input;
	}
}
