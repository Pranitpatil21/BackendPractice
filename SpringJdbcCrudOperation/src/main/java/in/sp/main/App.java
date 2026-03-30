package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.bean.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resource.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate template = context.getBean(JdbcTemplate.class); // we get template class because it is responsible
																		// for CRUD opperation

		// ----------------- INSERT OPERATION -----------------------//
//		int std_rollno = 21;
//		String std_name = "Pranit";
//		float std_marks = 94.5f;
//         
//        String insert_sql_query = "Insert into student values(?,?,?)";
//        int count = template.update(insert_sql_query,std_rollno,std_name,std_marks);
//        if(count > 0) {
//        	System.out.println("Inserted");
//        }else {
//        	System.out.println("Not Inserted");
//        }

		// ------------------- UPDATE OPERATION -----------------------//
//        float marks = 99.2f;
//        int rollno = 22;
//        String update_sql_query = "UPDATE student SET std_mark = ? WHERE std_roll = ?";
//         int count = template.update(update_sql_query,marks,rollno);
//         if(count>0) {
//        	 System.out.println("Updated");
//         }else {
//        	 System.out.println("Failed to Update");
//         }

		// ------------------- DELETE OPERATION -----------------------//

//        int rollno = 21;
//        
//        String delete_sql_query = "DELETE FROM student Where std_roll = ?";
//        int count = template.update(delete_sql_query,rollno);
//        if(count > 0) {
//        	System.out.println("Delete success");
//        }else {
//        	System.out.println("deletion failed");
//        }

		// ------------------- SELECT OPERATION -----------------------//

//		String select_sql_query = "SELECT * FROM student";
//		List<Student> std_list = template.query(select_sql_query, new StudentRowMapper()); // for this we need to create new student rowmapper class
//       
//		for(Student std : std_list) {
//        	System.out.println("Roll no: "+std.getRollno());
//        	System.out.println("Name: "+std.getName());
//        	System.out.println("Marks: "+std.getMarks());
//        	System.out.println("--------- ----------- ------------");
//        }

//		// ------------------- SELECT OPERATION 2 -----------------------//
//         // fetching only single object/row/record from database
//		
//        int rollno = 21;
//		String select_sql_query = "SELECT * FROM student WHERE std_roll = ?";
//		List<Student> std_list = template.query(select_sql_query, new StudentRowMapper(),rollno); // for this we need to create new student rowmapper class
//       
//		for(Student std : std_list) {
//        	System.out.println("Roll no: "+std.getRollno());
//        	System.out.println("Name: "+std.getName());
//        	System.out.println("Marks: "+std.getMarks());
//        	System.out.println("--------- ----------- ------------");
//        }
		
		// ------------------- SELECT OPERATION 3 -----------------------//
        // for single value there is no need of list for that we have another way
		
        int rollno = 21;
		String select_sql_query = "SELECT * FROM student WHERE std_roll = ?";
		Student std = template.queryForObject(select_sql_query, new StudentRowMapper(),rollno); // for this we need to create new student rowmapper class
      
       	System.out.println("Roll no: "+std.getRollno());
       	System.out.println("Name: "+std.getName());
       	System.out.println("Marks: "+std.getMarks());
	
	}
}
