package in.sp.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
   
	@Bean
	public Address createAddrObj1() {          
		 Address ad1 = new Address();
		 ad1.setCity("Nashik");
		 ad1.setHouseno(1);
		 ad1.setPincode(422209);
		 return ad1;
	}
	
	@Bean
	public Address createAddrObj2() {
		 Address ad1 = new Address();
		 ad1.setCity("Pune");
		 ad1.setHouseno(2);
		 ad1.setPincode(411033);
		 return ad1;
	}
	
	@Bean  
	public Subjects createSubjObj() {
		Subjects sub = new Subjects();
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Java");
		l1.add("C++");
		l1.add("Python");
		
		sub.setSubjects(l1);
		return sub;
	}
	
	@Bean
	public Student createStudObj() {
		Student s1 = new Student();
		s1.setName("pranit");
		s1.setRollno(21);
//		s1.setAddress(createAddrObj); // Manual Dependency Injection |  we dont need to write that because of used autowired in student class it do automatic
//		s1.setSubjects(createSubjObj());  same as above
		return s1;
	}
}
