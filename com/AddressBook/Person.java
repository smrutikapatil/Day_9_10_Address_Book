package com.AddressBook;

public class Person {

	    private String FirstName; 
	    private String LastName; 
	    private String Address;
	    private String City;
	    private String State;
	    private String EmailId;
	    private long PhoneNumber;
	    private int ZipCode;

	    public Person(String FirstName, String Address, String LastName, String City, String State, String EmailId,
	                     long PhoneNumber, int ZipCode) {
	    
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.City = City;
	        this.State = State;
	        this.EmailId = EmailId;
	        this.PhoneNumber = PhoneNumber;
	        this.ZipCode = ZipCode;
	    }

	    public Person() {
	    }

	    public  String getFirstName() {
	        return FirstName;
	    }

	    public void setFirstName(String FirstName) {
	        this.FirstName = FirstName;
	    }
	    
	    public String getLastName() {
	        return LastName;
	    }

	    public void setLastName(String LastName) {
	        this.LastName = LastName;
	    }
	    public String getAddress() {
	        return Address;
	    }

	    public void setAddress(String Address) {
	        this.Address = Address;
	    }

	    public String getEmailId() {
	        return EmailId;
	    }

	    public void setEmailId(String EmailId) {
	        this.EmailId = EmailId;
	    }

	   
	    public String getCityName() {
	        return City;
	    }

	    public void setCityName(String City) {
	        this.City = City;
	    }

	    public String getState() {
	        return State;
	    }

	    public void setState(String State) {
	        this.State = State;
	    }

	    public long getPhoneNumber() {
	        return PhoneNumber;
	    }

	    public void setPhoneNumber(long PhoneNumber) {
	        this.PhoneNumber = PhoneNumber;
	    }

	    public int getZipcode() {
	        return ZipCode;
	    }

	    public void setZipcode(int ZipCode) {
	        this.ZipCode = ZipCode;
	    }


	    @Override
	    public String toString() {
	        return "Person{" +"FirstName='" + FirstName + " \n" + " LastName='" + LastName + '\'' +" \n Address='" + Address + '\'' + " \n"
	        		+ " EmailId='" + EmailId + '\''  + " \n City='" + City + '\'' + " \n State='" + State + '\'' + " \n PhoneNumber=" + PhoneNumber +
	                " \n ZipCode=" + ZipCode + '}';
	        
    }
}