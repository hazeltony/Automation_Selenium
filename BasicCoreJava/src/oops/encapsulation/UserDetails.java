package oops.encapsulation;

public class UserDetails {

	private int age; 

	public int getAge() { //rightclick-source-generate getters and setters
		return age;
	}

	public void setAge(int age) {
		
		if(age>0)
		this.age = age;
	}

	private String name;
}
