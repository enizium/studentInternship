package com.intern.Model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
public class Student implements Serializable {

	private static final long serialVersionUID = 123138535651L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int id;
	private String firstname;
	private String lastname;
	private String course;
	private String address;
	private long phone;
	private Date date;
	
	@ManyToOne( 
			fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="mentor_id")
	private Mentor mentor_id;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL,
			mappedBy ="student")
	private List<Attendence> attendence;
	
	@OneToOne
	@JoinColumn(name="username")
	private User username;
	
	
	public Student() {
		super();
	}

	public Student(int id, String firstname, String lastname, String course, String address, long phone,
			Date date, Mentor mentor_id) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.mentor_id=mentor_id;
	}

	public Student(int id, String firstname, String lastname, String course, String address, long phone, Date date) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.date = date;
	}

	public Student(String firstname, String lastname, String course,
			String address, long phone, Date date, Mentor mentor_id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.mentor_id=mentor_id;

	}

	
	public Student(String firstname, String lastname, String course, String address, long phone, Date date,
			Mentor mentor_id, User username) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.mentor_id = mentor_id;
		this.username = username;
	}

	public Student(int id, String firstname, String lastname, String course, String address, long phone, Date date,
			Mentor mentor_id, User username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.mentor_id = mentor_id;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getdate() {
		return date;
	}

	public void setdate(Date date) {
		this.date = date;
	}

	public Mentor getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(Mentor mentor_id) {
		this.mentor_id = mentor_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}



}