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
	public Address createAddrObj() {
		 Address ad1 = new Address();
		 ad1.setCity("Nashik");
		 ad1.setHouseno(1);
		 ad1.setPincode(422209);
		 return ad1;
	}
	
	@Bean  
	public Subjects createSubjObj() {
		Subjects sub = new Subjects();
		
		List<String> l1 = new ArrayList<String>();
		l1.add("English");
		l1.add("Math");
		l1.add("Hindi");
		
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
