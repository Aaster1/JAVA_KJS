package CreateTeam.DAO;

import java.sql.SQLException;

import CreateTeam.DTO.Person;

public class NewStudentDAO extends JDBConnection{
	
	public Boolean createPerson(Person person) {
		
		String sql = "INSER INTO esd.team5(name,age,ses,grade,title) VALUES (?,?,?,?,?);";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1,person.getName());
			psmt.setInt(2,person.getAge());
			psmt.setString(3,person.getSes());
			psmt.setInt(4,person.getGrade());
			psmt.setString(5,person.getTitle());
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
