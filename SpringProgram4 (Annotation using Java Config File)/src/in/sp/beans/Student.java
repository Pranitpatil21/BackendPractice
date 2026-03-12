package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //spring container will create automatic object of this no neead to write bean in .xml
public class Student {
	
	@Value("pranit")
	private String name;
	@Value("pranit@gmail.com")
	private String email;
	@Value("21")
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	 public void display() {
		 System.out.println("Name: "+name);
		 System.out.println("Email: "+email);
		 System.out.println("Roll No: "+rollno);
	 }


}
