import javax.mail.internet.InternetAddress;

class A {
	public static void main(String args[]) throws Exception {
		InternetAddress address = new InternetAddress("ajay@liaison.com");

		address.validate();
	}
}