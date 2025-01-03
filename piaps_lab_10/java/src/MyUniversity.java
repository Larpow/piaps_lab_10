import javax.swing.border.EmptyBorder;

public class MyUniversity {
	public String name;
	public String address;
	public String phone;
	public void addEmployee(MyEmployee employee){
		System.out.println(employee.name + " is added!");
	}
	public void provideEducation(){
		System.out.println("Education is providing!");
	}
}