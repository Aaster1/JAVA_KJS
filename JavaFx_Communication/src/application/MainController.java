package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	
@FXML
	private TextField textName;

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void inputName(ActionEvent event) throws Exception{
		String name = textName.getText();
		
//		Sub.fxml 읽어오기
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sub.fxml"));
		root = loader.load(); 	//<-Sub 씬 가져옴
		
//		Sub.fxml에 연결된 SubController 가져올 수 있음.
		SubController subController = loader.getController();
		subController.printName(name);			//<-SubController를 통해서 Main씬에서 입력한 name(이름)을 Sub 씬에 넘김
		
		
//		Sub씬 출력
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
}
