package Aster.leveling.Dun;

import java.sql.SQLException;

public class EnermyStateData extends JDBConnection{
	public String NAME, EBN;

	public int HP, EXP, ATK, MATK, DEF, MDEF, EBQ;

	public EnermyStateData() {

	}

	public EnermyStateData(int no) {

		String sql = " SELECT * " + " FROM esd.esd1" + " WHERE no = ?";

		try {
			psmt = con.prepareStatement(sql); // <--쿼리 실행 객체 생성
//		psmt.setXXX(순서번호, 매핑할 값);
			psmt.setInt(1, no); // <--?(1) <--no(글번호)
			rs = psmt.executeQuery(); // 쿼리 실행

//			조회 결과 가져오기 & 클래스에 반영하기
			if (rs.next()) {
				NAME = (rs.getString("name"));
				HP = (rs.getInt("hp"));
				EXP=(rs.getInt("exp"));
				ATK=(rs.getInt("atk"));
				MATK=(rs.getInt("matk"));
				DEF=(rs.getInt("def"));
				MDEF=(rs.getInt("mdef"));
				EBN=(rs.getString("ebn"));
				EBQ=(rs.getInt("ebq"));
			}
		} catch (SQLException e) {
			System.err.println("SQL - ESD 조회 시, 에러 발생");
			e.printStackTrace();
		}
	}

	public EnermyStateData(String nAME, int hP, int eXP, int aTK, int mATK, int dEF, int mDEF, String eBN, int eBQ) {
		NAME = nAME;
		HP = hP;
		EXP = eXP;
		ATK = aTK;
		MATK = mATK;
		DEF = dEF;
		MDEF = mDEF;
		EBN = eBN;
		EBQ = eBQ;
	
	}
	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getEBN() {
		return EBN;
	}

	public void setEBN(String eBN) {
		EBN = eBN;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getEXP() {
		return EXP;
	}

	public void setEXP(int eXP) {
		EXP = eXP;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

	public int getMATK() {
		return MATK;
	}

	public void setMATK(int mATK) {
		MATK = mATK;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
	}

	public int getMDEF() {
		return MDEF;
	}

	public void setMDEF(int mDEF) {
		MDEF = mDEF;
	}

	public int getEBQ() {
		return EBQ;
	}

	public void setEBQ(int eBQ) {
		EBQ = eBQ;
	}

	
	
}