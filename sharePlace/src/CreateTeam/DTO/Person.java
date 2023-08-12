package CreateTeam.DTO;

public class Person {

	private int no,age,grade;
	private String name,title,ses;
	
	public Person() {
	}
	
	public Person(int no, int age, int grade, String name, String title, String ses) {
		super();
		this.no = no;
		this.age = age;
		this.grade = grade;
		this.name = name;
		this.title = title;
		this.ses = ses;
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
	public String getSes() {
		return ses;
	}
	public void setSes(String ses) {
		this.ses = ses;
	}

	@Override
	public String toString() {
		return "[ no : " + no + " || name : " + name + " || age : " + age + "|| ses : " + ses + " || grade : " + grade
				+ " || title : " + title + " ]";
	}
	
	
}