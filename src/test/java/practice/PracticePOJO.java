package practice;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PracticePOJO implements Serializable {

	
	ArrayList<Name> name;

	private PracticePOJO() {
	};

	public PracticePOJO(ArrayList<Name> name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		FirstName firstName = new FirstName("Pavan");
		LastName lastName = new LastName("kalyan");
		ArrayList<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
		Home home = new Home(123);
		Office office = new Office(456);
		phoneNumber.add(new PhoneNumber(home, office));
		ArrayList<Name> n = new ArrayList<Name>();
		n.add(new Name(firstName, lastName, phoneNumber));
		PracticePOJO p = new PracticePOJO(n);
		ObjectMapper obj = new ObjectMapper();

		obj.writerWithDefaultPrettyPrinter().writeValue(new File("./e2POJO.json"), p);

	}

}

class Office implements Serializable {
	private	int office;

	private Office() {
	};

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

class Home implements Serializable{
	private int home;

	private Home() {
	}

	public Home(int home) {
		super();
		this.home = home;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}
}

class PhoneNumber implements Serializable{
	private Home home;
	private Office office;

	
	private PhoneNumber() {};
	
	public PhoneNumber(Home home, Office office) {
		super();
		this.home = home;
		this.office = office;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
}

class FirstName implements Serializable{
	private String firstName;

	private FirstName() {};
	public FirstName(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

class LastName implements Serializable{
	private String lastName;
	private LastName() {};
	public LastName(String lastName) {
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

class Name implements Serializable{
	private FirstName firstName;
	private LastName lastName;
	private ArrayList<PhoneNumber> phoneNumber;

	private Name() {};
	public FirstName getFirstName() {
		return firstName;
	}

	public void setFirstName(FirstName firstName) {
		this.firstName = firstName;
	}

	public LastName getLastName() {
		return lastName;
	}

	public void setLastName(LastName lastName) {
		this.lastName = lastName;
	}

	public ArrayList<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(ArrayList<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Name(FirstName firstName, LastName lastName, ArrayList<PhoneNumber> phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

}