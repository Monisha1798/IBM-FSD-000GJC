package handson.mobilenum;

import java.util.Collections;

public class Contact implements Comparable<Contact>{
	
	
	String name,address,email;
	Long mobilenumber;
	public Contact()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Contact(String name, String address, String email, Long mobilenumber) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}
	@Override
	public int compareTo(Contact c) {
		// TODO Auto-generated method stub
		Collections.sort(mobilenumber);
		return 0;
	}

}
