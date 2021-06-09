package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;


public class Account {
	public int 	id;
	String	email;
	String	userName;
	String	fullName;
	Department 	department;
	Position	position;
	LocalDate	createDate;
	Group[] groups;
	
	Account(){
		
	} 
	
	public Account(int id, String email, String userName, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", departmentId=" + department + ", positionId=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
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
		Account other = (Account) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName)) {
			return false;
		}
		else if (id != other.id) {
			return false;
		}
		return true;
	}
	
}
