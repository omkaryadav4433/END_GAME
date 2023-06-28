package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.course;
import com.app.qualification;
import com.app.student;

import exception.studentManagementException;

public class validations {
	
	public static student validateallinputs(String rollno, String firstname, String lastname, String email, String address, String coursename,
			String qname, String dob,double fees,Map<String,student> studentmap) throws studentManagementException{
		
		checkfordup(rollno,studentmap);
		course validcourse=parseandvalidatecourse(coursename);
		qualification vqname=parseandvalidatequalification(qname);
		LocalDate validdob=parseandvalidatedob(dob);
		
				return new student(rollno,firstname,lastname,email,address,validcourse,vqname,validdob,fees);
		
	}

	public static qualification parseandvalidatequalification(String qname) throws studentManagementException{
		qualification q=qualification.valueOf(qname.toUpperCase());
		if(qualification.COMP != null)
			return q;
		else if(qualification.ELECT != null)
			return q;
		else if(qualification.ENTC != null)
			return q;
		else if(qualification.MECH != null)
			return q;
		else
			throw new studentManagementException("invalid qualification----");
	}

	public static course parseandvalidatecourse(String coursename) throws studentManagementException{
		
		return course.valueOf(coursename.toUpperCase());
	}

	public static void checkfordup(String rollno, Map<String, student> studentmap) throws studentManagementException {
	
		if(studentmap.containsKey(new student(rollno)))
			throw new studentManagementException("duplicate roll number found");
		
	}
	
	public static LocalDate parseandvalidatedob(String date) throws studentManagementException{
		
		LocalDate d=LocalDate.parse(date);
		LocalDate bdate=LocalDate.of(2000, 01, 01);
		if(d.isBefore(bdate))
			throw new studentManagementException("invalid birth date----");
		return d;
		
	}
	
	
	
	
	
	
	

}
