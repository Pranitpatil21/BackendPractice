package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

//first we created POJO(student) then applicationcontext.xml then main in main we started spring container then spring container see configation in configation we createed POJO class object and passed value springcontainer read that and executes
public class Main {

	public static void main(String[] args) {
		String config_loc = "in/sp/resources/applicationContext.xml";

		// Spring container will start
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

//		Student std = new Student(); this is not our responsibility its spring containers work to create object 
//		std.display();

		// spring container created object thsi time
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		System.out.println("----------------------------------");
		
		//second object
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
	}

}

// flow

//spring container read the .xml file in which we have tell that to create student(POJO) class object and set values