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
	
	public Boolean assign(int studentN, int teamN) {
		Person result = sdao.assign(studentN);
		if(result.getName()==null) {
			return false;
		}else {
		sdao.delete(studentN);
		result.setGrade(result.getGrade()+10);
		return sdao.assign2(result,teamN);
		}
	}
	public boolean setGrade(int teamNum, int studentNum, int grade) {
		
		return sdao.setGrade(teamNum,studentNum,grade);
	}
	
	public boolean initialize() {
		return sdao.initialize();
	}
	
	
	
}