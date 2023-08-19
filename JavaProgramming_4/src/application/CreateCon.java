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

public class CreateCon {

	 @FXML
	 private TextArea createContent;

	 @FXML
	 private TextField createTitle;

	 @FXML
	 private TextField createWriter;
	
	private Parent root;
	private	Stage stage;
	private	Scene scene;
	
	
//	돌아가는 버튼과 연동된 메소드입니다. 초기화면으로 돌아가는 기능입죠.
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
	
//	확인 버튼과 연동된 메소드입니다. 텍스트 필드 및 에리어에 입력된 값을 추출하여 DTO에 넣고 
	public void confirm(ActionEvent event) {
		Board board = new Board();
		
//		텍스트 필드 및 에리어에 입력된 값을 추출하여 DTO에 넣고
		board.setTitle(createTitle.getText());
		board.setWriter(createWriter.getText());
		board.setContent(createContent.getText());
		
//		그 DTO 채로 매개변수에 넣어 create 메소드를 호출합니다.
		Front.create(board);
		
//		그 이후엔 다시 초기화면으로 돌아가는 기능을 넣습니다.
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
