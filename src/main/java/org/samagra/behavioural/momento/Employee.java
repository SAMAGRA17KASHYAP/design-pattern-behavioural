package org.samagra.behavioural.momento;

public class Employee {

	private String name;
	private int age;
	private String phone;
	
	public Employee(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public EmployeeMomento save() {
		return new EmployeeMomento(name,phone);
	}
	
	public void revert(EmployeeMomento momento) {
		this.phone = momento.getPhone();
		this.name = momento.getName();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
}
