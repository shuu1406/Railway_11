import java.util.Date;

public class Group {
	int		id;
	String	name;
	int		creatorId;
	Date	createDate;
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", createDate=" + createDate + "]";
	}
	
}
