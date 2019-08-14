package helo_1408;

import java.io.Serializable;

public class Name implements Serializable{
	
	public String firstName;
	public String lastName;
	
	
	public Name()
	{
		super();
	}
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public String toString()
	{
		return " [First Name=" + firstName + ", Last Name =" +lastName +"]";
	}
	public Name createNewName(String firstName,String lastName ) throws NameNotValidException
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if(!(Character.isUpperCase(firstName.charAt(0))) || !(Character.isUpperCase(lastName.charAt(0))))
		{
			throw new NameNotValidException("Not a valid Name");
		}
		else
	      System.out.println("Valid Name");
		return new Name(firstName,lastName);
	}

}
