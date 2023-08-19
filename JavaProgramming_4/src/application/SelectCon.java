package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


//여기선 초기화를 진행하지 않습니다. 꼭 초기화가 필요한 공간이 아닌거같아서요~ 초기화가 필요한 내용들은, '이 씬(컨트롤러클래스)으로 갔을 때 항상 똑같이 일어나야한다-' 라는 기준점을 생각하면 좋을거같습니다.
//	이곳에선 더블클릭을 통해서 일어난 event에 대한 값을 넘겨받아, 정해진 틀 안에 내용이 다르게 변화해야하니 초기화가 필요한 작업은 없어보였어요!
public class SelectCon {

	
	
	public int tempBoardNo;		//<-Front.fxml에서 넘겨받은 tempNo(boardNo)를 이곳에 저장합니다.
	
	@FXML
	private TextField selectTitle;		//<-수정이 불가능하게 설정된 텍스트 필드와 텍스트에리어 들입니다!
	
	@FXML
	private TextField selectWriter;
	
	@FXML
    private TextArea selectContent;

    @FXML
    private TextField selectReg;


    @FXML
    private TextField selectUpd;

	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	
//	게시글 삭제 버튼과 연동된 메소드입니다.
	public void Delete(ActionEvent event) {
		Front.delete(tempBoardNo);		//<-프론트의 스태틱 메소드를 불러와 바로 삭제를 진행합니다.
		try {
//			이후 초기화면으로 돌아가는 기능입니다. 삭제하고 돌아가야 변화를 감지할 수 있을테니까요~
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Front.fxml"));		//<-다른 곳으로 갈 이유도 없지만, 강제로 가도 이상한 버그가 나타날겁니다. Front는 초기화작업을 통해 항상 같은 형태를 유지하고 있으며 다른 씬은 그렇지 않으니까요?
			root = loader.load();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	게시글 수정 버튼과 연동된 메소드입니다!
	@FXML
	public void UpdButton(ActionEvent event) {
		
		//빈 Board 객체를 하나 생성해서 게시글 내용물을 Board객체의 매개변수로 담은 뒤, 컨트롤러와 접촉 -> 컨트롤러 메소드 호출 -> 매개변수로 해당 Board 자료형 전달의 과정도 진행됩니다.
		Board board = new Board();
		board.setTitle(selectTitle.getText());
		board.setWriter(selectWriter.getText());
		board.setContent(selectContent.getText());
		
		try {
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Upd.fxml"));
			root = loader.load();
			
//			이 부분이 컨트롤러와 접촉하는 부분입니다.
			UpdCon updCon = loader.getController();		//<-접촉
			updCon.tempBoardNo = tempBoardNo;			//<-BoardNo 그대로 updCon 컨트롤러클래스의 멤버변수로 전달
			updCon.setting(board);						//<-setting()이라는 이름으로 정의된 메소드를 호출하여 매개변수를 담기
			
//			신 전환!
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}
//	표기는 뒤로가기 버튼이지만, 기능은 Front.fxml로 가는 기능입니다.
	@FXML
	public void backButton(ActionEvent event) {
		try {
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Front.fxml"));
			root = loader.load();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



//	Front.fxml의 더블클릭 이벤트 안에 있던 selCon.select(tempNo)의 정체입니다.
	public void select(int boardNo) {
		tempBoardNo = boardNo;		//<-클래스의 멤버변수로 선언되어있던 tempBoardNo를 바꿔줍니다. 이걸 안해주면 글 삭제 기능이 참조하는 보드 넘버가 이상한걸로 잡혀버릴거에요~
		Board board = Front.select(boardNo);	//<-static으로 선언해뒀던 메소드를 선언합니다. 매개변수로 넘겨받은 boardNo를 다시 매개변수로 활용해 실행하는 형태입니다. 그리고 Front.select()메소드의 반환값은 Board로 정의해놓았으니 바로 받아올 수가 있을거에요!
		
//		받은 board자료형의 매개변수를 가져와 fxml에 구현된 텍스트 필드 및 텍스트 에리어에 입힙니다.
		selectTitle.setText(board.getTitle());
		selectWriter.setText(board.getWriter());
		selectContent.setText(board.getContent());
		selectReg.setText(board.getRegDate());
		selectUpd.setText(board.getUpdDate());
	}
}
