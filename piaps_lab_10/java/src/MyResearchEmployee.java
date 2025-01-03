public class MyResearchEmployee extends MyEmployee {

	public int field_of_study;

	public void organiseResearch(String researchName){
		System.out.println("Research " + researchName+" is organised!");
	}
	public void startProject(MyProject project, MyStudent student){
		System.out.println("Project " + project.name+" is started with student "+ student.full_name);
	}
}