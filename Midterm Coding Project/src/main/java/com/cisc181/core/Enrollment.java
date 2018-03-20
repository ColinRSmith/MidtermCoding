package com.cisc181.core;
import java.util.UUID;

public class Enrollment 
{
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	
	private Enrollment()
	{
		
	}
	
	public Enrollment(UUID studentID, UUID sectionID)
	{
		//wasn't sure what you wanted enrollmentID set to, so I made it random
		 this.studentID = studentID;
		 this.sectionID = sectionID;
		 this.enrollmentID = UUID.randomUUID();
	}
	
	public UUID getSectionID()
	{
		return this.sectionID;
	}
	
	public UUID getStudentID()
	{
		return this.studentID;
	}
	public UUID enrollmentID()
	{
		return this.enrollmentID;
	}
	public double getGrade()
	{
		return this.grade;
	}

	public void setGrade(double grade)
	{
		this.grade = grade;
	}
	
}
