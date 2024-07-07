//package com.example;
class Voter{
	private String name;
	private String fatherName;
	private int age;
	private String id;
	public String getName() {
		return name;
	}
	public Voter(String name, String fatherName, int age, String id) throws InvalidVoterException {
		super();
		if(age<18) {
			throw new InvalidVoterException("Minimum age is 18");
		}
		this.name = name;
		this.fatherName = fatherName;
		
		this.age = age;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
class InvalidVoterException extends Exception{
	public InvalidVoterException(String msg) {
		super(msg);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		
			Voter v;
			try {
				v = new Voter("Ram", "Rahul", 19, "WPG4856A");
				System.out.println(v.getName()+ " registered");
			} catch (InvalidVoterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		

	}

}
