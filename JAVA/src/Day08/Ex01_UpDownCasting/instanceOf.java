package Day08.Ex01_UpDownCasting;

class Job{}
class Developer extends Job{}
class Designer extends Job{}
class Doctor extends Job{}

public class instanceOf {
	
	public static String checkJob(Job job) {								
		if(job instanceof Developer) {							//<--이게 dev 자료형인지를 묻는걸까?
			Developer dev = (Developer) job;
			return "개발자입니다.";
		}
		if(job instanceof Designer) {
			Designer design = (Designer) job;
			return "디자이너입니다.";
		}
		if(job instanceof Doctor) {
			Doctor doc = (Doctor) job;
			return "의사입니다.";
		}
		return "무직입니다.";
		
	}
	
	
	public static void main(String[] args) {
		
		Job job1 = new Developer();				//<--만약 업캐스팅을 안한다면 위 체크잡 메소드를 다수 만들어야 하지 않을까?
		Job job2 = new Designer();
		Job job3 = new Doctor();
		
		System.out.println("job1 : " + checkJob(job1));
		System.out.println("job2 : " + checkJob(job2));
		System.out.println("job3 : " + checkJob(job3));
		
		System.out.println();
	}
}
