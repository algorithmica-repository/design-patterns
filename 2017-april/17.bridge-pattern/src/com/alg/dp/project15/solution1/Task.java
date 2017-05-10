package com.alg.dp.project15.solution1;

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

	public Date getDuedate() {
		return duedate;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", duedate=" + duedate
				+ ", priority=" + priority + "]";
	}	
	

}
