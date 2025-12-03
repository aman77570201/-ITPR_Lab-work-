package com.knmodicollege.collegemanagement.controller;
import java.util.Scanner;

import com.knmodicollege.collegemanagement.model.Course;
import com.knmodicollege.collegemanagement.service.CourseService;
import com.knmodicollege.collegemanagement.service.impl.CourseServiceImpl;
public class CourseController 
{
	private CourseService courseService;
	
	//constructor
	public CourseController()
	{
		//to initailize service
		courseService = new CourseServiceImpl();
	}
	//user interface for registration of new course
	public void registerCourseUI()
	{
		Scanner sc = new Scanner(System.in);
		//input of course id
		System.out.print("Enter Course id(e.g, course101) : ");
		String courseId = sc.nextLine();
		System.out.print("Enter Course Name : ");
		String courseName = sc.nextLine();
		System.out.print("Enter Description : ");
		String courseDescription = sc.nextLine();
		System.out.print("Enter Duration(in Hour) : ");
		int courseDuration = sc.nextInt();
		System.out.print("Enter Minimum enrollment required : ");
		int minEnroll = sc.nextInt();
		System.out.print("Enter Maximum enrollment allowed : ");
		int maxEnroll = sc.nextInt();
		
		//calling register method
		courseService.registerCourse(new Course(courseId, courseName, courseDescription, courseDuration, minEnroll, maxEnroll));
		
	}
}
