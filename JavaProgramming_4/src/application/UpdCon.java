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

public class UpdCon {
	
	
//	SelectCon에서 전달받은 boardNo입니다.
	public int tempBoardNo;
	
	
//	수정화면에서 필요한 요소는 제목과 작성자, 내용의 3요소로만 두었습니다. no는 지정불가한 형식으로 SQL에서 자동으로 상승하도록 설계되어있으며(AI) 작성일자와 수정일자는 저희가 직접 수정하는게 아니라고 생각해서 뺐습죠.
	@FXML
	private TextArea updContent;

	@FXML
	private TextField updTitle;

	@FXML
	private TextField updWriter;
	    
	Parent root;
	Scene scene;
	Stage stage;
	
	
	
	
	
//	수정 화면 신으로 넘어오는 과정에서 실행했던 메소드입니다! 전달받은 SelecCon에서의 텍스트 필드 및 에리어 값을 DTO(Board)를 통해 전달받아 텍스트필드에 입혀주는 기능입니다.
//	물론 updCon에서의 텍스트필드 및 에리어는 자유롭게 수정이 가능하도록 옵션이 걸려있습니다. 
	public void setting(Board board) {
		updContent.setText(board.getContent());
		updTitle.setText(board.getTitle());
		updWriter.setText(board.getWriter());
	}
	
//	뒤로가기 기능입니다! 앞선 SelectCont에서의 기능과 동일합니다!
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
	
	
//	확인 버튼과 연동된 메소드입니다!
	public void confirm(ActionEvent event) {
		Board board = new Board();
		
//		확인 버튼을 누르는 순간 텍스트 필드에 적힌 Text내용을 추출하여 DTO(Board)에 입힙니다.
		board.setTitle(updTitle.getText());
		board.setWriter(updWriter.getText());
		board.setContent(updContent.getText());
		
//		Front.upd()메소드를 호출하여 매개변수로 DTO(Board)와 boardNo를 전달하고 그 뇨속이 받은걸로 작업을 수행할 수 있도록 해줍니다.
		Front.upd(board,tempBoardNo);
		
//		수정 완료 후의 작업은 초기화면으로 돌아가기입니다.
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
	
}
