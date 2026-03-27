package in.sp.beans;

public class Student {
	private String name;
	private int rollno;
	
   //bytype checks this datatype like Address if matches then it do auto wire to address  
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
      
	public void setAddress(Address address) {
		this.address = address;
	}
   
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Address: "+address);
	}
}
