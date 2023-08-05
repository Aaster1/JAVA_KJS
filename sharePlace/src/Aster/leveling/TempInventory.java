package Aster.leveling;

import java.sql.SQLException;

import Aster.leveling.Dun.JDBConnection;

public class TempInventory extends JDBConnection{
	
	String NAME;
	int qtt;
	public TempInventory() {
		this("UnknownItem",0);
	}
	
	
	public TempInventory(String nAME, int qtt) {
		NAME = nAME;
		this.qtt = qtt;
	}


	public void invenOpen() {
		TempInventory[] tia = new TempInventory[22];
		String sql = "SELECT *" + "FROM esd.inven";
		try {
			stmt = con.createStatement();		//<--쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);		//<--쿼리 실행 - 결과 --> rs(ResultSet)
			int i =0;
			while(rs.next()) {
				TempInventory ti = new TempInventory(); 
//				결과 데이터 가져오기
//				rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다.
				ti.NAME = rs.getString("name");
				ti.qtt = rs.getInt("quantity");
				
				if(i>=22)break;
				tia[i++] = ti;
			}
		} catch (SQLException e) {
			System.err.println("인벤토리를 불러오는데 실패했습니다.");
			e.printStackTrace();
		}	
		System.out.println("============================================================================================================");
		System.out.println();
		for (TempInventory isTia : tia) {
			if(isTia!=null)System.out.print("\t『" + isTia.NAME +"』\t수량 : "+isTia.qtt);
		}
	}
	
	public void useItem(int tempInt){
			String name="";
			switch (tempInt) {
			case 1:
				name="슬라임점액";
				break;
			case 2:
				name="찢어진 천조각";
				break;
			case 3:
				name="만질 수 없는 헝겊";
				break;
			case 4:
				name="부식된 뼈";
				break;
			case 5:
				name="악취 나는 살점";
				break;
			case 6:
				name="따듯한 털가죽";
				break;
			case 7:
				name="리자드맨의 비늘";
				break;
			case 8:
				name="섬뜩한손뼈";
				break;
			case 9:
				name="흉흉한 두개골";
				break;
			case 10:
				name="장식용 글레이브";
				break;
			case 11:
				name="오우거의 뿔";
				break;
			case 12:
				name="뱀파이어의 로브";
				break;
			case 13:
				name="골렘의 코어";
				break;
			case 14:
				name="빛나는 생명의 베슬";
				break;
			case 15:
				name="이형의 이빨";
				break;
			case 16:
				name="위대한 뿔";
				break;
			case 17:
				name="지배자의 왕관";
				break;
			case 18:
				name="태양에 그을린 날개깃";
				break;
			case 19:
				name="용의 심장";
				break;
			case 20:
				name="고대의 비문";
				break;
			case 21:
				name="세계의 심장";
				break;
			case 22:
				name="마왕의 옥쇄";
				break;
			}
			
			
			String sql = " SELECT * " + " FROM esd.inven"+" WHERE name = ? AND quantity>=1";
			
			
			try {
				psmt = con.prepareStatement(sql);		//<--쿼리 실행 객체 생성
//			psmt.setXXX(순서번호, 매핑할 값);
				psmt.setString(1, name);				//<--?(1) <--스위치 문으로 전환된 매개변수<아이템 이름>)
				rs = psmt.executeQuery();					//쿼리 실행
				if(rs.next()) {
					int tempQtt = rs.getInt("quantity");					
					
				
				
				if(tempQtt<=1) {
//				조회 결과 가져오기
					
					
					String sqlD = " DELETE FROM esd.inven " + " WHERE name= ? ";
					
					
					try {
						psmt=con.prepareStatement(sqlD);
						psmt.setString(1, name);
						
						psmt.executeUpdate();
						
					} catch (SQLException e) {
						System.err.println("아이템 삭제 시, 에러 발생(useItem)");
						e.printStackTrace();
					}
					}
					else {
						
						String sqlU = " UPDATE esd.inven" + " SET quantity = ?"  + " WHERE name= ? ";
						
						
						try {
							psmt=con.prepareStatement(sqlU);
							psmt.setInt(1, (tempQtt-1));;
							psmt.setString(2, name);
							
							psmt.executeUpdate();
							
						} catch (SQLException e) {
							System.err.println("아이템 수량 감소 시, 에러 발생");
							e.printStackTrace();
						}
						
					}
				}
				System.out.println(name+"을 소모했습니다.");
			} catch (SQLException e) {
				System.err.println("아이템 사용에 실패하였습니다.");
				e.printStackTrace();
			}
		}
	
	
	public void getItem(int tempInt){
		String name="";
		switch (tempInt) {
		case 1:
			name="슬라임점액";
			break;
		case 2:
			name="찢어진 천조각";
			break;
		case 3:
			name="만질 수 없는 헝겊";
			break;
		case 4:
			name="부식된 뼈";
			break;
		case 5:
			name="악취 나는 살점";
			break;
		case 6:
			name="따듯한 털가죽";
			break;
		case 7:
			name="리자드맨의 비늘";
			break;
		case 8:
			name="섬뜩한손뼈";
			break;
		case 9:
			name="흉흉한 두개골";
			break;
		case 10:
			name="장식용 글레이브";
			break;
		case 11:
			name="오우거의 뿔";
			break;
		case 12:
			name="뱀파이어의 로브";
			break;
		case 13:
			name="골렘의 코어";
			break;
		case 14:
			name="빛나는 생명의 베슬";
			break;
		case 15:
			name="이형의 이빨";
			break;
		case 16:
			name="위대한 뿔";
			break;
		case 17:
			name="지배자의 왕관";
			break;
		case 18:
			name="태양에 그을린 날개깃";
			break;
		case 19:
			name="용의 심장";
			break;
		case 20:
			name="고대의 비문";
			break;
		case 21:
			name="세계의 심장";
			break;
		case 22:
			name="마왕의 옥쇄";
			break;
		}
		String sql = " SELECT * " + " FROM esd.inven"+" WHERE name = ? AND quantity>=1";
		
		
		try {
			psmt = con.prepareStatement(sql);		//<--쿼리 실행 객체 생성
//		psmt.setXXX(순서번호, 매핑할 값);
			psmt.setString(1, name);				//<--?(1) <--스위치 문으로 전환된 매개변수<아이템 이름>)
			rs = psmt.executeQuery();					//쿼리 실행
			if(rs.next()) {
				int tempQtt = rs.getInt("quantity");
				String sqlU = " UPDATE esd.inven" + " SET quantity= ? " +  " WHERE name = ? ";
				
//			- now() : 현재 날짜 / 시간을 반환하는 MySQL 함수
				
				try {
					psmt=con.prepareStatement(sqlU);
					psmt.setInt(1, (tempQtt+1));;
					psmt.setString(2, name);		
					
					psmt.executeUpdate();
					
				} catch (SQLException e) {
					System.err.println("수량 증가 시, 에러 발생 (getItem");
					e.printStackTrace();
			}
			}else{	
			String sqlC = " INSERT INTO esd.inven( name, quantity ) "+ " VALUES ( ?, ? )";		//<--띄어쓰기 주의!!!
			try {
				psmt = con.prepareStatement(sqlC);
				psmt.setString(1, name);		//<--이름 매핑
				psmt.setInt(2, 1);		//<--수량 매핑
				
				psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴			조회 시엔 executeQuery, 수정 시엔 executeUpdate
															//게시글 1개 쓰기 성공시, result : 1
															//				실패 시, result : 0
															//여기선 미사용
				
			} catch (SQLException a) {
				System.err.println("아이템 생성 시, 에러 발생(getItem)");
				a.printStackTrace();
			}
			
			
			}
			
//			조회 결과 가져오기
			
		} catch (SQLException e) {
			System.err.println("아이템 생성 시, 에러 발생(getItem)");
			e.printStackTrace();
				
		
}
	}
	
	public TempInventory(String nAME, int no, int qtt) {
		NAME = nAME;
		this.qtt = qtt;
	}
	
	
}