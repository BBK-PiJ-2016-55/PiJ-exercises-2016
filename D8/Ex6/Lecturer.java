/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer {
	private Teacher teacher = new Teacher("Boberta");
	
	public void teach(String lessonName){
		teacher.teach(lessonName);
	}
	
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
}