package oops.encapsulation;

public class User {

	public static void main(String[] args) {

		UserDetails details = new UserDetails();
		details.setAge(-10);
		System.out.println(details.getAge());
	}

}
