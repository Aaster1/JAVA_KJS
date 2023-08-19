package CreateTeam.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import CreateTeam.DTO.Person;

public class StudentDAO extends JDBConnection{

	public StudentDAO(){
	}
		public ArrayList<Person> importTeam(int team){
			ArrayList<Person> personList = new ArrayList<>();
			
			String sql = "SELECT * " + " FROM esd.team?";
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, team);
				rs = psmt.executeQuery();
				while(rs.next()) {
					Person person = new Person();
					person.setNo(rs.getInt("no"));
					person.setAge(rs.getInt("age"));
					person.setGrade(rs.getInt("grade"));
					person.setName(rs.getString("name"));
					person.setTitle(rs.getString("title"));
					person.setSes(rs.getString("ses"));
					
					personList.add(person);
					
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return personList;
		}
		
		public Person assign(int studentN) {
			Person person = new Person();
			
			String sql = "SELECT * " + "FROM aster.team5 " + "WHERE no = ?";
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, studentN);
				rs = psmt.executeQuery();
				if(rs.next()) {
					person.setNo(rs.getInt("no"));
					person.setAge(rs.getInt("age"));
					person.setGrade(rs.getInt("grade"));
					person.setName(rs.getString("name"));
					person.setTitle(rs.getString("title"));
					person.setSes(rs.getString("ses"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return person;
		}
		public boolean setGrade(int teamN,int studentN,int grade) {
			int result = 0;
			
			String sql = "UPDATE aster.team? " + "SET grade = ? " + "WHERE no = ?";
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, teamN);
				psmt.setInt(2, grade);
				psmt.setInt(3, studentN);
				 result = psmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return result>0;
		}
		public boolean assign2(Person result, int teamN) {
			int result2 = 0;
			String sql = "INSERT INTO aster.team? " + " (no,name,age,ses,grade,title) VALUES ( ?, ?, ?, ?, ?, ?)";
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1,teamN);
				psmt.setInt(2, result.getNo());
				psmt.setString(3, result.getName());
				psmt.setInt(4, result.getAge());
				psmt.setString(5, result.getSes());
				psmt.setInt(6, result.getGrade());
				psmt.setString(7, result.getTitle());
				result2 = psmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return result2>0;
		}
		
		public boolean initialize() {
			
					String sql = " DELETE FROM aster.team1; ";
					String sql2 = " DELETE FROM aster.team2; ";
					String sql3 = " DELETE FROM aster.team3; ";
					String sql4 = " DELETE FROM aster.team4; ";
					String sql5 = " DELETE FROM aster.team5; ";
					String sql6 = "INSERT INTO aster.team5(no,name,age,ses,grade,title) VALUES(1,'강진수',29,'남',0,'강아지')"
							+", (2,'구교찬',24,'남',0,'없음')"
							+", (3,'김수빈',26,'여',0,'없음')"
							+", (4,'김준혁',24,'남',0,'없음')"
							+", (5,'이용성',31,'남',0,'없음')"
							+", (6,'이유나',27,'여',0,'없음')"
							+", (7,'이정훈',32,'남',0,'없음')"
							+", (8,'임성민',28,'남',0,'없음')"
							+", (9,'정슬기',31,'여',0,'없음')"
							+", (10,'정재원',41,'남',0,'없음')"
							+", (11,'한현진',28,'남',0,'없음')"
							+", (12,'추윤주',27,'여',0,'없음');";
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(sql);
				stmt.executeUpdate(sql2);
				stmt.executeUpdate(sql3);
				stmt.executeUpdate(sql4);
				stmt.executeUpdate(sql5);
				stmt.executeUpdate(sql6);
				
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		public void delete(int studentN) {
			String sql = " DELETE FROM aster.team5 WHERE no = ? ";
			
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1,studentN);
				psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

