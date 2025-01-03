public class MyFaculty {

	public String name;
	public void acceptStudent(MyStudent student){
		System.out.println(student.full_name + "is accepted!");
	}
	public void removeStudent(MyStudent student){
		System.out.println(student.full_name + "is removed!");
	}
}