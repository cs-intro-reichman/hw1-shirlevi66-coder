// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill1 = Integer.parseInt(args[3]);
		double payment = bill1/3.0;
		payment = Math.ceil(payment);
		System.out.println("Dear " + name3 + ", " + name2 + ", " + name1 + ": pay " + payment + " Shekels each");
	    // Replace this comment with the rest of your code   

		// Dear c, b, and a: pay 80.0 Shekels each
		// c, b, a, please pay 80.0 each.
	}
}
