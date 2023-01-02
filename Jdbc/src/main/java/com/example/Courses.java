package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // use Entity Annotation to create table
@Table(name="Course_Details")// change table name using Table Annotation
public class Courses 
{
	@Id //use Id annotation to declare primary key 
	private int C_Id;
	private String Course_name;
	
	@ManyToOne // use ManyToOne annotation for Mapping 
	private Teacher teacher;

	public Courses() //Default Constructor
	{
		
	}

	public Courses(int c_Id, String course_name, Teacher teacher) //Parameterized constructor
	{
		super();
		C_Id = c_Id;
		Course_name = course_name;
		this.teacher = teacher;
	}

	// use getter setter method
	public int getC_Id()
	{
		return C_Id;
	}

	public void setC_Id(int c_Id) 
	{
		C_Id = c_Id;
		
		}

		public String getCourse_name() 
		{
			return Course_name;
		}

		public void setCourse_name(String course_name) 
		{
			Course_name = course_name;
		}

		public Teacher getTeacher() 
		{
			return teacher;
		}

		public void setTeacher(Teacher teacher)
		{
			this.teacher = teacher;
		}
		
		
	}
