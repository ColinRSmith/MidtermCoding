package com.cisc181.core;
import java.util.UUID;
import java.util.Date;


public class Semester 
{

	private UUID semesterID;
	private Date startDate;
	private Date endDate;
	
	public Semester()
	{
		
	}
	
	public Semester(UUID semesterID, Date startDate, Date endDate)
	{
		this.semesterID = semesterID;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UUID getSemesterID()
	{
		return this.semesterID;
	}
	
	public Date getStartDate()
	{
		return this.startDate;
	}
	
	public Date getEndDate()
	{
		return this.endDate;
	}
	
	
	
	
}
