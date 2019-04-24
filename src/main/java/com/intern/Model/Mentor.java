package com.intern.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Mentor_tbl")
public class Mentor implements Serializable {
	private static final long serialVersionUID = 89451212L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "mendor_id")
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private long phone;
	private String mentorship;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "mentor_id")
	private List<Student> students;

	@OneToOne
	@JoinColumn(name="username")
	private User username;

	public Mentor() {
		super();
	}

	public Mentor(String firstname, String lastname, String address, long phone, String mentorship) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
	}

	public Mentor(int id, String firstname, String lastname, String address, long phone, String mentorship) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
	}

	public Mentor(String firstname, String lastname, String address, long phone, String mentorship,
			List<Student> students) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
		this.students = students;

	}

	public Mentor(String firstname, String lastname, String address, long phone, String mentorship,
			List<Student> students, User username) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
		this.students = students;
		this.username = username;
	}

	public Mentor(int id, String firstname, String lastname, String address, long phone, String mentorship,
			List<Student> students, User username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
		this.students = students;
		this.username = username;
	}

	public Mentor(int id, String firstname, String lastname, String address, long phone, String mentorship,
			List<Student> students) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.mentorship = mentorship;
		this.students = students;
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

	public String getMentorship() {
		return mentorship;
	}

	public void setMentorship(String mentorship) {
		this.mentorship = mentorship;
	}

	public List<Student> getStudent_id() {
		return students;
	}

	public void setStudent_id(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}

}
