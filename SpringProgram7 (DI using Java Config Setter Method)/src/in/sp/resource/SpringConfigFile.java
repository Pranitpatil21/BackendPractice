package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration 
public class SpringConfigFile {
	
	@Bean
     public Address createAddrObj() {	 
    	  Address adrr = new Address();
    	 adrr.setCity("Nashik");
    	 adrr.setHouseno(21);
    	 adrr.setPincode(422209);
    	 
    	 return adrr;
     }
	@Bean
    public Student createStudObj() {	 
     Student stdd = new Student();
     stdd.setName("Pranit");
     stdd.setRollno(21);
     stdd.setAdress(createAddrObj());
     return stdd;
    }
}
