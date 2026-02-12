package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.Beans.Student;

public class App {
    
	public static void main(String[] args) {
		String Conig_file_loc = "in/sp/resource/ApplicationContext.xml";
      ApplicationContext context =  new ClassPathXmlApplicationContext(Conig_file_loc);
      Student std = context.getBean(Student.class);
      std.display();
    }
}
