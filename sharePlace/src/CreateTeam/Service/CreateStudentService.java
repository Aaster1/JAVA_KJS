package CreateTeam.Service;

import CreateTeam.DAO.NewStudentDAO;
import CreateTeam.DTO.Person;

public class CreateStudentService {

		private NewStudentDAO nsdao = new NewStudentDAO();
		
		public boolean createPerson(Person person) {
			
			return nsdao.createPerson(person);
		}
}
