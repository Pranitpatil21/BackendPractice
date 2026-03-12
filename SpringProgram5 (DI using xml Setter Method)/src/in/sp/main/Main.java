package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
     public static void main(String[] args) {
        String config_file_loc = "/in/sp/resource/ApplicationContext.xml"; 	
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
     
      Student std = (Student) context.getBean("stdId");
      std.display();
    	 
   }
}





//one class depends on another is dependency injection like student class depends on address