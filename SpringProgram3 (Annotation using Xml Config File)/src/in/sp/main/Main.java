package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
  public static void main(String[] args) {
	  String resoure_file_path = "in/sp/beans/resources/ApplicationContext.xml";
	  ApplicationContext context = new ClassPathXmlApplicationContext(resoure_file_path);
	  
	  Student std = (Student) context.getBean("student");
      std.display(); 
  
  }
}
