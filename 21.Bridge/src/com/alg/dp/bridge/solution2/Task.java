package com.alg.dp.bridge.solution2;

import java.util.Date;

public class Task {
	private String description;
	private Date duedate;
	private int priority;
	
	public Task(String description, Date duedate, int priority) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", duedate=" + duedate
				+ ", priority=" + priority + "]";
	}	
	
	
}
