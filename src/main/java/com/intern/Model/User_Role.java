package com.intern.Model;

import javax.persistence.*;

@Entity
@Table(name="user_role")
public class User_Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="user_roleId")
	private int id;
	private String role;
	 
	@OneToOne(cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="user_id")
	private User user;

	public User_Role() {
		super();
	}

	public User_Role(int id, String role, User user) {
		super();
		this.id = id;
		this.role = role;
		this.user = user;
	}

	public User_Role(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	
	
	
	
}
