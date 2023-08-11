package Day14.Board.DAO;

import java.util.List;

import Day14.Board.DTO.Text;

public interface DataService {

	List <?extends Text> selectList();
	List <?extends Text>selectList(int no);
	
//	데이터 조회
	Text select(int no); 
	
//	데이터 등록
	
	int insert(Text text);
	int update(Text text);
	
	
//	데이터 삭제
	
	int delete(int no);
}
