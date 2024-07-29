package POJO_CLASS_PRACTICE;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String id;
	private String value;

	public User() {
	};

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public User(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
}

class Manager {

	private String id;
	private String value;

	public Manager() {
	};

	public Manager(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", value=" + value + "]";
	}
}

class Value {

	private List<User> user;
	private List<Manager> manager;
	private String pinNumber;

	public Value() {
	};

	public Value(List<User> user, List<Manager> manager, String pinNumber) {
		super();
		this.user = user;
		this.manager = manager;
		this.pinNumber = pinNumber;
	}

	public List<User> getUser() {
		return user;
	}

	public List<Manager> getManager() {
		return manager;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public void setManager(List<Manager> manager) {
		this.manager = manager;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	
}

public class Employee {
	Value value;
	String itemConfigId;

	public Employee() {
	};

	public Employee(Value value, String itemConfigId) {
		super();
		this.value = value;
		this.itemConfigId = itemConfigId;
	}

	@Test
	public void employeePOJO() throws Throwable{
		List<User> user = new ArrayList<User>();
		user.add(new User("TEK123", "PAVAN"));
		
		List<Manager> manager =new ArrayList<Manager>();
		manager.add(new Manager("TEK789", "kalyan"));
		
		Value value = new Value(user, manager, "ABC567");
		
		Employee ePOJO = new Employee(value, "ITEM0123");
		
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./p12.json"), ePOJO);

		System.out.println("===done===");
	}

}
