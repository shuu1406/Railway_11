import java.time.LocalDate;
import java.util.Date;


public class Exam {
	int 	id;
	String	code;
	String	title;
	CategoryQuestion	categoryId;
	int		Duration;
	int 	creatorID;
	Date	createDate;
	Question[] questions;
}
