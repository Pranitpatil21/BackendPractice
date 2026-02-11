package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.bean.Student;

//for this class we need to create student class  //created in in.sp.bean folder

public class StudentRowMapper implements  RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student std = new Student();
        std.setRollno(rs.getInt("std_roll"));
        std.setName(rs.getString("std_name"));
        std.setMarks(rs.getFloat("std_mark"));
        return std;
	}
}
