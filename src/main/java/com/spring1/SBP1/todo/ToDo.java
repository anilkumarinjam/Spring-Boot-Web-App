package com.spring1.SBP1.todo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class ToDo {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	@Size(min=5, message="Enter atleast 5 Characters")
	private String description;
	private LocalDate targetdate;
	private boolean done;

	public ToDo() {
		
	}
	public ToDo(int id,String username,String description,LocalDate targetdate,boolean done) {
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetdate = targetdate;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", targetdate="
				+ targetdate + ", done=" + done + "]";
	}
}