package CreateTeam.TeamAssign;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import CreateTeam.DTO.Person;
import CreateTeam.Service.CreateStudentService;
import CreateTeam.Service.CreateTeamService;

public class Front {
	
	static ArrayList<Person> team1 = new ArrayList<Person>();
	
	static ArrayList<Person> team2 = new ArrayList<Person>();
	static ArrayList<Person> team3 = new ArrayList<Person>();
	static ArrayList<Person> team4 = new ArrayList<Person>();
	static ArrayList<Person> nonAssign= new ArrayList<Person>();
	static Person person = new Person();
	static CreateTeamService cts = new CreateTeamService();
	static CreateStudentService css = new CreateStudentService();

	static Scanner sc = new Scanner(System.in);
	static void menu() {
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t1. 전체 열람\t2. 팀 열람\t3. 미배정 인원 열람");
		System.out.println();
		System.out.println("\t4. 팀 배정\t5. 점수 기입\t6. 전체 초기화");
		System.out.println();
		System.out.println("\t7.인원 등록\t0. 종료");
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.print(" 입력>> ");

	}
	static void anyKey() {
		System.out.println();
		System.out.print("\t아무 키나 입력해 다음으로 넘어가세요.");
		Object temp = sc.nextLine();
		System.out.println();
	}
	
	static void systemDown() {
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t팀 배정 시스템을 종료합니다.");
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();

	}
	static void wrong() {
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t잘못된 입력입니다.");
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
	}
	
	static void selectTeamAll() {
		team1.clear();
		team1.addAll(cts.personList(1));

		System.out.println();
		System.out.println("================ 1팀 ===================================================================================================");
		System.out.println();
		for (Person team1p : team1) {
			System.out.println(team1p);
		}
		team2.clear();
		team2.addAll(cts.personList(2));

		System.out.println();
		System.out.println("================ 2팀 ===================================================================================================");
		System.out.println();
		for (Person team2p : team2) {
			System.out.println(team2p);
		}
		team3.clear();
		team3.addAll(cts.personList(3));

		System.out.println();
		System.out.println("================ 3팀 ===================================================================================================");
		System.out.println();
		for (Person team3p : team3) {
			System.out.println(team3p);
		}
		team4.clear();
		team4.addAll(cts.personList(4));


		System.out.println();
		System.out.println("================ 4팀 ===================================================================================================");
		System.out.println();
		for (Person team4p : team4) {
			System.out.println(team4p);
		}

		System.out.println();
		System.out.println("================ 미배정 인원 ===================================================================================================");
		System.out.println();
		nonAssign.clear();
		nonAssign.addAll(cts.personList(5));
		for (Person nA : nonAssign) {
			System.out.println(nA);
		}
		System.out.println("===================================================================================================================");
		System.out.println();
		anyKey();
		
	}
	
	static int selectTeam() {
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.print("\t팀 번호를 입력해주세요.");
		int N = sc.nextInt();
		sc.nextLine();		
		switch (N) {
		case 1:
			team1.clear();
			team1.addAll(cts.personList(1));

			System.out.println();
			System.out.println("================ 1팀 ===================================================================================================");
			System.out.println();
			for (Person team1p : team1) {
				System.out.println(team1p);
			}
			System.out.println("===================================================================================================================");
			anyKey();
			break;
		case 2:
			team2.clear();
			team2.addAll(cts.personList(2));

			System.out.println();
			System.out.println("================ 2팀 ===================================================================================================");
			System.out.println();
			for (Person team2p : team2) {
				System.out.println(team2p);
			}
			System.out.println("===================================================================================================================");

			anyKey();
			break;
		case 3:
			team3.clear();
			team3.addAll(cts.personList(3));

			System.out.println();
			System.out.println("================ 3팀 ===================================================================================================");
			System.out.println();
			for (Person team3p : team3) {
				System.out.println(team3p);
			}
			System.out.println("===================================================================================================================");

			anyKey();
			break;
		case 4:
			team4.clear();
			team4.addAll(cts.personList(4));

			System.out.println();
			System.out.println("================ 4팀 ===================================================================================================");
			System.out.println();
			for (Person team4p : team4) {
				System.out.println(team4p);
			}
			System.out.println("===================================================================================================================");

			anyKey();
			break;

		default:
			wrong();
			break;
		}
		return N;
	}
	
	static void nonAssignPerson() {
		nonAssign.clear();
		nonAssign.addAll(cts.personList(5));

		System.out.println();
		System.out.println("================ 미배정 인원 ===================================================================================================");
		System.out.println();
		for (Person nA : nonAssign) {
			System.out.println(nA);
		}
		anyKey();

	}
	
	static void assignTeam() {
		nonAssign.clear();
		nonAssign.addAll(cts.personList(5));

		System.out.println();
		System.out.println("================ 미배정 인원 ===================================================================================================");
		System.out.println();
		for (Person nA : nonAssign) {
			System.out.println(nA);
		}
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t학생을 선택해주세요");
		int studentN = sc.nextInt();
		sc.nextLine();
		System.out.println("\t배정시킬 팀 번호를 입력해주세요.");
		int teamN = sc.nextInt();
		sc.nextLine();
		
		boolean result = cts.assign(studentN,teamN);
		if(result) {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t팀 배정이 성공적으로 완료되었습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();

		}else {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t팀 배정에 실패하였습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();

		}
		
	}
	
	static void setGrade() {
		int N = selectTeam();
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t점수를 수정할 학생의 번호를 입력하세요.");
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.print("입력>>");
		int sN = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		System.out.println("\t몇 점으로 수정하시겠습니까?");
		System.out.println();
		System.out.println("===================================================================================================================");
		System.out.println();
		int gN = sc.nextInt();
		sc.nextLine();
		boolean result = cts.setGrade(N,sN,gN);
		if(result) {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t점수 기입이 성공적으로 완료되었습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t점수 기입에 실패하였습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			
		}
	}
	
	static void initializeAll() {
		boolean result = cts.initialize();
		if(result) {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t데이터베이스가 초기화 되었습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t데이터베이스 초기화에 실패하였습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();

		}
	}
	
	static void createPerson() {
		boolean on =true;
		System.out.println();
		System.out.println("================ 인원 등록 ===================================================================================================");
		System.out.println();
		String name = null, title=null,ses=null;
		int age=0,grade=0;
		do {
		try {
			System.out.println();
			System.out.print("\t이름>>");
			name = sc.nextLine();
			System.out.println();
			System.out.print("\t성별>>");
			ses = sc.nextLine();
			System.out.println();
			System.out.print("\t나이>>");
			age = sc.nextInt();
			sc.nextLine();
			System.out.println();
			System.out.print("\t초기 점수>>");
			grade = sc.nextInt();
			sc.nextLine();
			System.out.println();
			System.out.print("\t별명>>");
			title = sc.nextLine();
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t입력하신 정보는 다음과 같습니다.");
			System.out.println();
			System.out.println("\t이름 : "+name+"\t성별 : "+ses+"\t나이 : "+age+"\n\n\t초기 점수 : "+grade+"\t별명 : "+title);
			System.out.println();
			System.out.println("\t 위 내용으로 확정하시겠습니까? (Y/N)");
			try {
				String answer = sc.next();
				if(answer.equals("Y")) {
					System.out.println();
					System.out.println("===================================================================================================================");
					System.out.println();
					System.out.println("\t확정되었습니다.");
					System.out.println();
					System.out.println("===================================================================================================================");
					on= false;
				}else if (answer.equals("N")) {
					System.out.println();
					System.out.println("===================================================================================================================");
					System.out.println();
					System.out.println("\t취소하였습니다.");
					System.out.println();
					System.out.println("===================================================================================================================");
				
				}else {
					System.out.println("\t잘못된 입력입니다.");
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}

			
			
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		}while(on);
		person.setName(name);
		person.setAge(age);
		person.setSes(ses);
		person.setGrade(grade);
		person.setTitle(title);
		boolean result = css.createPerson(person);
		if(result) {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t인원 등록이 성공적으로 완료되었습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();

		}else {
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();
			System.out.println("\t인원 등록에 실패하였습니다.");
			System.out.println();
			System.out.println("===================================================================================================================");
			System.out.println();

		}
	}
	
	
	public static void main(String[] args) {

		boolean on = true;
		do {
			menu();
			int N = sc.nextInt();
			sc.nextLine();
			switch (N) {
			case 0:
				systemDown();
				on=false;
				break;
			case 1:
				selectTeamAll();
				break;
			case 2:
				selectTeam();
				break;
			case 3:
				nonAssignPerson();
				break;
			case 4:
				assignTeam();
				break;
			case 5:
				setGrade();
				break;
			case 6:
				initializeAll();
				break;
			case 7:
				createPerson();
				break;

			default:
				wrong();
				break;
			}
		}while(on);
		
		
	}
	
}
