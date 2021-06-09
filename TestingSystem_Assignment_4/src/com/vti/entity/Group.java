package com.vti.entity;
import java.util.Arrays;
import java.util.Date;

public class Group {
	int		id;
	String	name;
	int		creatorId;
	Date	createDate;
	Account[]	accounts;
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", createDate=" + createDate
				+ ", accounts=" + Arrays.toString(accounts) + "]";
	}
	
	
}
