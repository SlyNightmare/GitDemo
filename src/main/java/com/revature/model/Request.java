package com.revature.model;

public class Request {

	private int id;
	private String date;
	private int amount;
	private String note;
	private String approval;
	
	
	public Request(int id, String date, int amount, String note, String approval) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.note = note;
		this.approval = approval;
	}

	public Request(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((approval == null) ? 0 : approval.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (amount != other.amount)
			return false;
		if (approval == null) {
			if (other.approval != null)
				return false;
		} else if (!approval.equals(other.approval))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", date=" + date + ", amount=" + amount + ", note=" + note + ", approval="
				+ approval + "]";
	}
	
	
	
	
}
