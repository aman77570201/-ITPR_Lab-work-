package com.knmodicollege.collegemanagement.dao;

import com.knmodicollege.collegemanagement.model.Faculty;
import java.util.*;

/*---- this is DAO layer which will interact with database directly -----*/
public interface FacultyDAO 
{
	/*---- to insert data into the faculty table ----*/
	int save(Faculty facultyData);
	
	/*--- to fetch complete faculty list ---*/
	ArrayList<Faculty> findAll();
	
	/*--- to fetch faculty details based on faculty id ----*/
	Faculty findByFacultyId(String facultyId);
	
	/*---- to update Faculty mobile number based on faculty id ---*/
	int updateFacultyMobileByFacultyId(String facultyId, String mobile);
}
