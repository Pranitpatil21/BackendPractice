package in.sp.beans;

public class Student {
	
    private int rollno;
	private String name;
    private Address address;

   public Student(String name,int rollno,Address address) {
	   this.name = name;
	   this.rollno = rollno;
	   this.address = address;
   } 
   
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Address: "+address);
	}
    
}
