package CreateTeam.DTO;

public class Person {

	private static Person instance;
	private int no,age,grade;
	private String name,title,ses;
	
	private Person() {
		
	}
	public static Person getInstance() {
		if(instance == null) instance = new Person();
		return instance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public static void setInstance(Person instance) {
		Person.instance = instance;
	}
	public String getSes() {
		return ses;
	}
	public void setSes(String ses) {
		this.ses = ses;
	}
	
}