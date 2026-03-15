package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration 
public class SpringConfigFile {
	
	@Bean
     public Address createAddrObj() {	 
    
		 Address adrr = new Address(12,"Nashik",422209);
    	 return adrr;
     }
	
	@Bean
    public Student createStudObj() {	 
     Student stdd = new Student(121,"Sahil",createAddrObj());
     return stdd;
    }
}
