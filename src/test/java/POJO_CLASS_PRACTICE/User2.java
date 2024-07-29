package POJO_CLASS_PRACTICE;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Name {
	Object[] name;

	public Name(Object[] name) {
		super();
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object[][] name) {
		this.name = name;
	}

}

class FirstName {
	public FirstName(String firstName) {
		super();
		this.firstName = firstName;
	}

	String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

class Lastname {
	String lastName;

	public Lastname(String lastName) {
		super();
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

class Office {
	int office;

	public Office(int office) {
		super();
		this.office = office;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}
}

class Home {
	int Home;

	public Home(int home) {
		super();
		Home = home;
	}

	public int getHome() {
		return Home;
	}

	public void setHome(int home) {
		Home = home;
	}
}

class PhoneNumber {
	Object[] phoneNumber;

	public PhoneNumber(Object[] phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public Object[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Object[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

public class User2 implements Serializable {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		PhoneNumber phoneNumber = new PhoneNumber(new Object[] { new Home(123), new Office(456) });
		Name name = new Name(new Object[] { new FirstName("D1"), new Lastname("D2"), phoneNumber });

		ObjectMapper objm = new ObjectMapper();
		objm.writerWithDefaultPrettyPrinter().writeValue(new File("./abc.json"), name);
		System.out.println("done");
	}
}
