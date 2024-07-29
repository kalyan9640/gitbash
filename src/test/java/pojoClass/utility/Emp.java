package pojoClass.utility;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Name{
	public String firstName;
	public String lastName;
	public ArrayList<PhoneNumber> phoneNumber;

	private Name() {
	};

	public Name(String firstName, String lastName, ArrayList<PhoneNumber> phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(ArrayList<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

class PhoneNumber  {
	public int home;
	public int office;

	public PhoneNumber(int home, int office) {
		super();
		this.home = home;
		this.office = office;
	}

	public PhoneNumber() {

	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

}
class Run{
	ArrayList<Name> n=new ArrayList<Name>();

	public Run() {};
	public Run(ArrayList<Name> n) {
		super();
		this.n = n;
	}

	public ArrayList<Name> getN() {
		return n;
	}

	public void setN(ArrayList<Name> n) {
		this.n = n;
	}
	
	
}




public class Emp implements Serializable {

	
	public static void main(String[] args) throws Throwable {
		
		ArrayList<PhoneNumber>p=new ArrayList<PhoneNumber>();
		p.add(new PhoneNumber(123,456));
		ArrayList<Name>n=new ArrayList<Name>();
		n.add(new Name("D1", "D2", p));
		Run r=new Run(n);
		
		ObjectMapper obj = new ObjectMapper();

		obj.writerWithDefaultPrettyPrinter().writeValue(new File("./empPOJO.json"), r);

	}
}
