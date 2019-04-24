package com.intern.Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
public class User implements Serializable {

	private static final long serialVersionUID = 123135135651L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private long phone;
	private String username;
	private String password;
	private String active;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, 
			mappedBy = "user")
	private User_Role user_role;

	@OneToOne( 
			mappedBy="username")
	private Student student;

	@OneToOne (
	mappedBy = "username")
	private Mentor mentor;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, long phone, String username, String password,
			String active) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public User(int id, String firstName, String lastName, String email, long phone, String username, String password,
			String active, User_Role user_role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.active = active;
		this.user_role = user_role;
	}

	public User(int id, String firstName, String lastName, String email, long phone, String username, String active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.active = active;
	}

	public User(int id, String firstName, String lastName, String email, long phone, String username, String active,
			User_Role user_role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.active = active;
		this.user_role = user_role;
	}

	public User(String firstName, String lastName, String email, long phone, String username, String password,
			String active, User_Role user_role, Mentor mentor) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.active = active;
		this.user_role = user_role;
		this.mentor = mentor;
	}

	public User(int id, String firstName, String lastName, String email, long phone, String username, String password,
			String active, User_Role user_role, Student student) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.active = active;
		this.user_role = user_role;
		this.student = student;
	}

	public User(int id, String firstName, String lastName, String email, long phone, String username, String password,
			String active, User_Role user_role, Mentor mentor) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.active = active;
		this.user_role = user_role;
		this.mentor = mentor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public User_Role getUser_role() {
		return user_role;
	}

	public void setUser_role(User_Role user_role) {
		this.user_role = user_role;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

}
