import java.util.Date;

public class MyProject {

	public String name;
	public Date start;
	public Date end;
	public int hours;

	public int getProjectDuration(){
		return end.compareTo(start);
	}

}