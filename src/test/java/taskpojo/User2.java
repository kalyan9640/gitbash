package taskpojo;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Name {
	List name;

	public Name(List name) {
		super();
		this.name = name;
	}

	public List getName() {
		return name;
	}

	public void setName(List name) {
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
	List phoneNumber;

	public PhoneNumber(List phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public List getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

public class User2 implements Serializable {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		List a = Arrays.asList(new Home(123), new Office(456));
		PhoneNumber phoneNumber = new PhoneNumber(a);
		List b = Arrays.asList(new FirstName("pavan"), new Lastname("kalyan"), phoneNumber);
		Name name = new Name(b);
		ObjectMapper objm = new ObjectMapper();
		objm.writerWithDefaultPrettyPrinter().writeValue(new File("./usingList.json"), name);
		System.out.println("done");
	}
}
