package com.cisc181.core;
import java.util.UUID;
public class Section {
	private UUID courseID;
	private UUID semesterID;
	private UUID sectionID;
	private int roomID;
	
	public Section()
	{
		
	}
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID)
	{
		this.courseID = courseID;
		this.semesterID = semesterID;
		this.sectionID = sectionID;
		this.roomID = roomID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}

	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}

	public UUID getCourseID()
	{
		return this.courseID;
	}
	public UUID getSemesterID()
	{
		return this.semesterID;
	}
	public UUID getSectionID()
	{
		return this.sectionID;
	}
	public int roomID()
	{
		return this.roomID;
	}
}
