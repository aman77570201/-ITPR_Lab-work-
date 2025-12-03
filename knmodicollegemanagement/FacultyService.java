package com.knmodicollege.collegemanagement.service;

import com.knmodicollege.collegemanagement.model.Faculty;

public interface FacultyService 
{
    // method to register new faculty
    void registerFaculty(Faculty faculty);

    // method to update faculty experience
    void updateFacultyExperience(String facultyId, int experience);

    // method to fetch all faculty records
    void getFacultyList();

    // method to fetch details of a particular faculty
    void getFacultyDetails(String facultyId);
}
