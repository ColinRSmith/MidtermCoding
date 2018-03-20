package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
public class Course
{
	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private eMajor major;
	
	public Course()
	{
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major)
	{
		this.courseID =  courseID;
		this.courseName = courseName;
		this.gradePoints = gradePoints;
		this.major = major;
	}
	
	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public void setMajor(eMajor major) {
		this.major = major;
	}

	public UUID getCourseID()
	{
		return this.courseID;
	}
	
	public String getCourseName()
	{
		return this.courseName;
	}
	
	public int getGradePoints()
	{
		return this.gradePoints;
	}
	public eMajor getMajor()
	{
		return this.major;
	}
	
}
