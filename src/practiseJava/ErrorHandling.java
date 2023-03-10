package practiseJava;

public class ErrorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testError();
	}

	public static void testError() {
		try {
			Class.forName("practiseJava.ErrorHandling");
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Test Git");
		}
	}
}
