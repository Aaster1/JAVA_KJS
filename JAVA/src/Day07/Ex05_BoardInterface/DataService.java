package Day07.Ex05_BoardInterface;


public interface DataService {

	Text[] selectList();
	Text[] selectList(int boardNo);
	
//	데이터 조회
	Text select(int no); 
	
//	데이터 등록
	
	int insert(Text text);
	int update(Text text);
	
	
//	데이터 삭제
	
	int delete(int no);
}
