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

	public void getPotionAction(int N) {												//조건문 대폭 수정. if(treu&true)로 성공 값 넣고, false&true, true&fasle, fasle&false의 경우를
		switch (N) {																			//전부 
		case 1:																				//
			boolean tempPotion1 = false;
			boolean tempPotion3 = false;
			tempPotion1=useItem(1);
			tempPotion3=useItem(3);
			if(tempPotion1&&tempPotion3){
				getItem(23);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion1==false&&tempPotion3==true) {
				notCreateGetItem(1);
			}
			else if (tempPotion1==true&&tempPotion3==false) {
				notCreateGetItem(3);
			}else if(tempPotion1==false&&tempPotion3==false){
					notCreateGetItem(1);
					notCreateGetItem(3);
				}
			
			break;		
		case 2:
			boolean tempPotion4 = false;
			boolean tempPotion8 = false;
			tempPotion4=useItem(4);
			tempPotion4=useItem(8);
			if(tempPotion4&&tempPotion8){
				getItem(24);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion4==false&&tempPotion8==true) {
				notCreateGetItem(4);
			}
			else if (tempPotion4==true&&tempPotion8==false) {
				notCreateGetItem(8);
			}else if(tempPotion4==false&&tempPotion8==false){
					notCreateGetItem(4);
					notCreateGetItem(8);
				}
			
			break;		
		case 3:
			boolean tempPotion2 = false;
			boolean tempPotion5 = false;
			tempPotion1=useItem(2);
			tempPotion5=useItem(5);
			if(tempPotion2&&tempPotion5){
				getItem(25);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion2==false&&tempPotion5==true) {
				notCreateGetItem(2);
			}
			else if (tempPotion2==true&&tempPotion5==false) {
				notCreateGetItem(5);
			}else if(tempPotion2==false&&tempPotion5==false){
					notCreateGetItem(2);
					notCreateGetItem(5);
				}
			
			break;	
		case 4:
			boolean tempPotion6 = false;
			boolean tempPotion7 = false;
			tempPotion6=useItem(6);
			tempPotion7=useItem(7);
			if(tempPotion6&&tempPotion7){
				getItem(26);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion6==false&&tempPotion7==true) {
				notCreateGetItem(6);
			}
			else if (tempPotion6==true&&tempPotion7==false) {
				notCreateGetItem(7);
			}else if(tempPotion6==false&&tempPotion7==false){
					notCreateGetItem(6);
					notCreateGetItem(7);
				}
			
			break;	
		case 5:
			boolean tempPotion9 = false;
			boolean tempPotion11 = false;
			tempPotion9=useItem(9);
			tempPotion11=useItem(11);
			if(tempPotion9&&tempPotion11){
				getItem(27);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion9==false&&tempPotion11==true) {
				notCreateGetItem(9);
			}
			else if (tempPotion9==true&&tempPotion11==false) {
				notCreateGetItem(11);
			}else if(tempPotion9==false&&tempPotion11==false){
					notCreateGetItem(9);
					notCreateGetItem(11);
				}
			
			break;	
		case 6:
			boolean tempPotion10 = false;
			boolean tempPotion15 = false;
			tempPotion10=useItem(10);
			tempPotion15=useItem(15);
			if(tempPotion10&&tempPotion15){
				getItem(28);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion10==false&&tempPotion15==true) {
				notCreateGetItem(10);
			}
			else if (tempPotion10==true&&tempPotion15==false) {
				notCreateGetItem(15);
			}else if(tempPotion10==false&&tempPotion15==false){
					notCreateGetItem(10);
					notCreateGetItem(15);
				}
			
			break;	
		case 7:
			
			boolean tempPotion12 = false;
			boolean tempPotion17 = false;
			tempPotion12=useItem(12);
			tempPotion17=useItem(17);
			if(tempPotion12&&tempPotion17){
				getItem(29);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion12==false&&tempPotion17==true) {
				notCreateGetItem(12);
			}
			else if (tempPotion12==true&&tempPotion17==false) {
				notCreateGetItem(17);
			}else if(tempPotion12==false&&tempPotion17==false){
					notCreateGetItem(12);
					notCreateGetItem(17);
				}
			
			break;	
		case 8:
			boolean tempPotion13 = false;
			boolean tempPotion14 = false;
			tempPotion13=useItem(13);
			tempPotion14=useItem(14);
			if(tempPotion13&&tempPotion14){
				getItem(23);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion13==false&&tempPotion14==true) {
				notCreateGetItem(13);
			}
			else if (tempPotion13==true&&tempPotion14==false) {
				notCreateGetItem(14);
			}else if(tempPotion13==false&&tempPotion14==false){
					notCreateGetItem(13);
					notCreateGetItem(14);
				}
			
			break;	
		case 9:
			boolean tempPotion16 = false;
			boolean tempPotion18 = false;
			tempPotion16=useItem(16);
			tempPotion18=useItem(18);
			if(tempPotion16&&tempPotion18){
				getItem(23);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『슬라임의 포션』을 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
				
			}
			else if (tempPotion16==false&&tempPotion18==true) {
				notCreateGetItem(16);
			}
			else if (tempPotion16==true&&tempPotion18==false) {
				notCreateGetItem(18);
			}else if(tempPotion16==false&&tempPotion18==false){
					notCreateGetItem(16);
					notCreateGetItem(18);
				}
			
			break;	
		case 10:
			boolean tempPotion41 = false;
			boolean tempPotion42 = false;
			boolean tempPotion43 = false;
			tempPotion41=useItem(19);
			if(tempPotion41==false) {
				notCreateGetItem(19);
				break;
			}
			tempPotion42=useItem(19);
			if(tempPotion42==false) {
				notCreateGetItem(19);
				break;
			}
			tempPotion43=useItem(19);
			if(tempPotion43==false) {
				notCreateGetItem(19);
				break;
			}
			if(tempPotion41&&tempPotion42&&tempPotion43){
				getItem(32);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『가공된 용의 심장』를 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
			}
			break;		
		case 11:
			boolean tempPotion19 = false;
			boolean tempPotion21 = false;
			tempPotion19=useItem(19);
			if(tempPotion19==false) {
				notCreateGetItem(19);
				break;
			}
			tempPotion21=useItem(21);
			if(tempPotion21==false) {
				notCreateGetItem(21);
				break;
			}
			if(tempPotion19&&tempPotion21){
				getItem(33);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『용의 정수』를 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
			}
			break;		
		case 12:
			boolean tempPotion20 = false;
			boolean tempPotion22 = false;
			tempPotion20=useItem(20);
			if(tempPotion20==false) {
				notCreateGetItem(20);
				break;
			}
			tempPotion22=useItem(22);
			if(tempPotion22==false) {
				notCreateGetItem(22);
				break;
			}
			if(tempPotion20&&tempPotion22){
				getItem(34);
				System.out.println();
				System.out.println("==================================================================================================================================");
				System.out.println();
				System.out.println("\t『절대자의 재림』를 제조했습니다.");
				System.out.println();
				System.out.println("==================================================================================================================================");
			}
			break;		
		}
	}

	public void invenOpen() {
		TempInventory[] tia = new TempInventory[22];
		String sql = "SELECT *" + "FROM esd.inven " + " ORDER BY name ASC ";
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
			System.err.println("\t인벤토리를 불러오는데 실패했습니다.");
			e.printStackTrace();
		}	
		System.out.println("============================================================================================================");
		System.out.println();
		for (TempInventory isTia : tia) {
			if(isTia!=null)System.out.print("\t『" + isTia.NAME +"』\t\t수량 : "+isTia.qtt);
			System.out.println();
		}
	}
	
	public boolean useItem(int tempInt){
		boolean used=false;
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
			case 23:
				name="슬라임 포션";
				break;
			case 24:
				name="잔혹한 냉기";
				break;
			case 25:
				name="프로틴 2007";
				break;
			case 26:
				name="바람의 가호";
				break;
			case 27:
				name="수호자의 증언";
				break;
			case 28:
				name="투사의 유언";
				break;
			case 29:
				name="검붉은 은총";
				break;
			case 30:
				name="마공학 핵";
				break;
			case 31:
				name="창공의 수혜";
				break;
			case 32:
				name="가공된 용의 심장";
				break;
			case 33:
				name="용의 정수";
				break;
			case 34:
				name="절대자의 재림";
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
					
				
				
				if(tempQtt==1) {
//				조회 결과 가져오기
					
					
					String sqlD = " DELETE FROM esd.inven " + " WHERE name= ? ";
					
					
					try {
						psmt=con.prepareStatement(sqlD);
						psmt.setString(1, name);
						
						psmt.executeUpdate();
						used=true;
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
							used=true;
						} catch (SQLException e) {
							System.err.println("아이템 수량 감소 시, 에러 발생");
							e.printStackTrace();
						}
						
					}
				System.out.println(name+"을 소모했습니다.");
				}
				else {
					System.err.println(name+"아이템이 없습니다.");
					used=false;
				}
			} catch (SQLException e) {
				System.err.println("아이템 사용에 실패하였습니다.");
				e.printStackTrace();
			}
			return used;
		}
	
	
	public String getItem(int tempInt){
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
		case 23:
			name="슬라임 포션";
			break;
		case 24:
			name="잔혹한 냉기";
			break;
		case 25:
			name="프로틴 2007";
			break;
		case 26:
			name="바람의 가호";
			break;
		case 27:
			name="수호자의 증언";
			break;
		case 28:
			name="투사의 유언";
			break;
		case 29:
			name="검붉은 은총";
			break;
		case 30:
			name="마공학 핵";
			break;
		case 31:
			name="창공의 수혜";
			break;
		case 32:
			name="가공된 용의 심장";
			break;
		case 33:
			name="용의 정수";
			break;
		case 34:
			name="절대자의 재림";
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
		return name;
	}
	
	public String notCreateGetItem(int tempInt){
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
		case 23:
			name="슬라임 포션";
			break;
		case 24:
			name="잔혹한 냉기";
			break;
		case 25:
			name="프로틴 2007";
			break;
		case 26:
			name="바람의 가호";
			break;
		case 27:
			name="수호자의 증언";
			break;
		case 28:
			name="투사의 유언";
			break;
		case 29:
			name="검붉은 은총";
			break;
		case 30:
			name="마공학 핵";
			break;
		case 31:
			name="창공의 수혜";
			break;
		case 32:
			name="가공된 용의 심장";
			break;
		case 33:
			name="용의 정수";
			break;
		case 34:
			name="절대자의 재림";
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
					e.printStackTrace();
			}
			}
			
//			조회 결과 가져오기
			
		} catch (SQLException e) {
			e.printStackTrace();
				
		
}
		return name;
	}
	
	public TempInventory(String nAME, int no, int qtt) {
		NAME = nAME;
		this.qtt = qtt;
	}
	
	
}