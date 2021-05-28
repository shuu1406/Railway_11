import java.time.LocalDate;


public class Account {
	int 	id;
	String	email;
	String	userName;
	String	fullName;
	Department 	departmentId;
	Position	positionId;
	LocalDate	createDate;
	Group[] groups;
}
