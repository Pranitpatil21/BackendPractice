package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

//previous time we have used resoure.xml this time we do it in java

@Configuration
public class SpringConfigFile {
     
//	@Bean
//	public Student stdId() {
//		Student std = new Student();
//	    std.setName("Pranit");
//	    std.setEmail("Pranit@mail.com");
//	    std.setRollno(21);
//	    
//	    return std;
//	}

	@Bean("bean1")    //by this we can give custom/own name too bean and call it
	public Student stdId() {
		Student std = new Student();
	    std.setName("Pranit");
	    std.setEmail("Pranit@gmail.com");
	    std.setRollno(21);
	    
	    return std;
	}
	
	@Bean("bean2")    //by this we can give custom/own name too bean and call it
	public Student stdId2() {
		Student std = new Student();
	    std.setName("Sahil");
	    std.setEmail("Sahil@gmail.com");
	    std.setRollno(01);
	
	    return std;
	}
}
 