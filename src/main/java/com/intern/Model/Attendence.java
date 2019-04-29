package com.intern.Model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "attendence_table")
public class Attendence implements Serializable {

	private static final long serialVersionUID = 465415121321L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attendence_id")
	private int id;
	private Date date;
	private String remark;

	@ManyToOne
	@JoinColumn(name = "username")
	private Student student;

	public Attendence() {
		super();
	}

	public Attendence(Date date, String remark) {
		super();
		this.date = date;
		this.remark = remark;
	}

	public Attendence(int id, Date date, String remark, Student student) {
		super();
		this.id = id;
		this.date = date;
		this.remark = remark;
		this.student = student;
	}

	public Attendence(Date date, String remark, Student student) {
		super();
		this.date = date;
		this.remark = remark;
		this.student = student;
	}

	public Attendence(int id, Date date, String remark) {
		super();
		this.id = id;
		this.date = date;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
