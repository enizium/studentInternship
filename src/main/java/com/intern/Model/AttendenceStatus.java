package com.intern.Model;
 
import javax.persistence.*;

@Entity
@Table(name="attendence_tbl")
public class AttendenceStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="attendence_id")
	private int id;
	private String title;
	private String allDay;
	private String backgroundColor;
	private String borderColor;
	
	@ManyToOne
	@JoinColumn(name="username")
	private Student student;
	
	
	public AttendenceStatus(int id, String title, String allDay, String backgroundColor, String borderColor) {
		super();
		this.id = id;
		this.title = title;
		this.allDay = allDay;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
	}
	public AttendenceStatus(String title, String allDay, String backgroundColor, String borderColor) {
		super();
		this.title = title;
		this.allDay = allDay;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
	}
	
	
	public AttendenceStatus(int id, String title, String allDay, String backgroundColor, String borderColor,
			Student student) {
		super();
		this.id = id;
		this.title = title;
		this.allDay = allDay;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.student = student;
	} 
	 
	public AttendenceStatus(String title, String allDay, String backgroundColor, String borderColor, Student student) {
		super();
		this.title = title;
		this.allDay = allDay;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAllDay() {
		return allDay;
	}
	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "AttendenceStatus [  title=" + title + ", allDay=" + allDay + ", backgroundColor="
				+ backgroundColor + ", borderColor=" + borderColor + ", student=" + student + "]";
	}
 
 

}
