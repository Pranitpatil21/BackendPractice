package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String name;
	private int rollno;

	@Autowired    // By Using This we dont need to maunually write dependeny injection in config file
	@Qualifier("createAddrObj2")    // thjs will remove the confusion which bean object we should called (to avoid error when there are two same bean objects)
	private Address address;

	@Autowired              //our bean object in config file will automatically injected in this 
	private Subjects subjects;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


//	public void setSubjects(Subjects subjects) {
//		this.subjects = subjects;
//	}

	
//		public void setAddress(Address address) {
//			this.address = address;                           //no need of manualy DI we have use autowired
//		}

	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("rollNo: " + rollno);
		System.out.println("Address: " + address);
		System.out.println("Subjects: " + subjects);
	}
}
