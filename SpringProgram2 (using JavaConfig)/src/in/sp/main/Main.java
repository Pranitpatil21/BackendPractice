package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
     public static void main(String[] args) {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	 
//    	 Student std = (Student) context.getBean("stdId");
//    	 std.display();
    	 
    	  //another way
//    	 Student std = context.getBean(Student.class);
//    	 std.display();
      
    	 //given own name for bean
    	 Student std = (Student) context.getBean("bean1");
    	 std.display();
    	 System.out.println("----------------------------------------------");
    	 
    	 Student std2 = (Student) context.getBean("bean2");
    	 std2.display(); 
     } 
}
