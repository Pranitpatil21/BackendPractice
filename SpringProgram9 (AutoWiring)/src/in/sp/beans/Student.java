package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
        
	    private String name;
        private int rollno;
        
        @Autowired      //By Using This we dont need to maunually write dependeny injection in config file
        private Address address;
        
		public void setName(String name) {
			this.name = name;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		
		
//		public void setAddress(Address address) {
//			this.address = address;                           //no need of manualy DI we have use autowired
//		}
		
		public void display() {
		  System.out.println("Name: "+name);
		  System.out.println("rollNo: "+rollno);
		  System.out.println("Address: "+address);
		}
}
