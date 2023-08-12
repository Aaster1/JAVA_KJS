package CreateTeam.Service;

import java.util.ArrayList;

import CreateTeam.DAO.StudentDAO;
import CreateTeam.DTO.Person;

public class CreateTeamService {

//	public ArrayList<Person> personList = new ArrayList<>();
	
	private StudentDAO sdao = new StudentDAO();

	public ArrayList<Person> personList(int team){
		return sdao.importTeam(team);
	}
	
	public boolean assign(int studentN, int teamN) {
		Person person = sdao.importPerson(studentN);
		person.setGrade(person.getGrade()+10);
		
		
		return sdao.assign(studentN,teamN);
	}
	public boolean setGrade(int teamNum, int studentNum) {
		
		return sdao.setGrade(teamNum,studentNum);
	}
	
	public boolean initialize() {
		return sdao.initialize();
	}
	
	
	
}