package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FrontCon implements Initializable{
	
	
//	Front.fxml에서 정의한 각 태그(버튼이나 라벨 따위들)에 fx:id를 붙이고, 그 id를 컨트롤러에 가져온 형태입니다.
	 @FXML
	    private TableView<Board> colAll;		//<-테이블뷰 = 박스

	    @FXML
	    private TableColumn<Board, Integer> colNo;		//<-테이블컬럼 = 열

	    @FXML
	    private TableColumn<Board, String> colTitle;

	    @FXML
	    private TableColumn<Board, String> colWriter;
	    
	    @FXML
	    private TableColumn<Board, String> colReg;
	    
	    @FXML
	    private TableColumn<Board, String> colUpd;
	    
	    private Stage stage;		//<-빈 Stage 자료형의 변수 정의;
	    private Scene scene;
	    private Parent root;
	    
	    List<Board> tempBoardList = new ArrayList<>();	//<-빈 Board자료형 List 생성. 구현 타입은 ArrayList. List로의 업캐스팅은 안해도 무방함. 
	    
	


	    
//	    *******초기세팅을 잡아주는 작업. Front.fxml이 실행되고 연결된 컨트롤러가 불러와질 때 가장 먼저 실행되는 작업!!!!! = initialize
//	    해당 컨트롤러 클래스가 Initializable을 구현하고 필수적으로 오버라이딩 해주기 위해 가져온 추상메소드가 initialize입니다. 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		//<-이악물고 매개변수 무시
		tempBoardList.addAll(Front.selectAll());		//<-빈 List객체에 저희가 미리 만들어놓았던 static selectAll()메소드를 퓨전해줍니다. 이 메소드의 반환타입이 List라는 사실을 이용해 Front.selectAll()메소드의 실행과 그 반환값을 addAll로 받아버렸습니다.

		ObservableList<Board> list = FXCollections.observableArrayList(tempBoardList);	//<-TableView태그 자료형에 List자료형을 입히기 위해 필요한 과정인듯합니다.
		colAll.setItems(list);		//<-TableView태그 자료형에 LIst자료형을 세팅해주긴 했지만 아직 보이지 않습니다.
		
		
		colNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));			//<-사실 구조를 이해하기 너무도 머리아픕니다. 그래서 그냥 각 열마다 getBoardNo()메소드에서의 get을 떼고 읽어오는 기묘한 방법이구나- 하고 넘어갔습니다. 실제로 그렇게 구동하는 식인듯합니다(추측).
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colReg.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colUpd.setCellValueFactory(new PropertyValueFactory<>("UpdDate"));
		
		colAll.setOnMouseClicked(new EventHandler<MouseEvent>() {		//<-마우스 클릭 이벤트를 엽니다.

			@Override
			public void handle(MouseEvent event) { //<-EventHandler를 구현하기 위한 메소드랩니다.
				if(event.getClickCount()==2) {		//<-마우스 더블클릭을 조건으로 아래의 내용을 실행한다는 의미일거에요.
					int tempNum = colAll.getSelectionModel().getSelectedItem().getBoardNo();	//<-getSelectionModel().getSelectedItem()로 가져오게 되는거 선택된 Board자료형이더라고요? 그래서 그 뒤에 .getBoardNo() 붙이니까 넘버가 가져와졌습니다.
																								//굳이 이걸 가져와서 tempNum으로 지정하는 이유는, 다른 곳(컨트롤러 클래스)으로 tempNumd을 넘기기 위해서에요!					
					try {
						
//빈 stage를 채우기 위한, 접근법입니다. 지금 저희가 발생시킨 마우스클릭 이벤트의 소스 환경을 타고, scene환경을 타고, window환경까지 오니 다운캐스팅을 통해 stage로 접근이 가능하더라- 라는 느낌입니다.
//getScene()까지 썼을 때 빨간줄 뜨면서 Node로 다운캐스팅하라는 추천이 뜨니 그걸 진행하신 다음, getWindow()까지 오시면 또 빨간줄이 뜨면서 stage로의 다운캐스팅 제안이 뜹니다.
						stage = (Stage) ((Node) event.getSource()).getScene().getWindow();		
						
						FXMLLoader loader = new FXMLLoader(getClass().getResource("Select.fxml"));		//<-아까 봤던 소스 -> 로더 생성의 과정. 하지만 소스가 Select.fxml
						root = loader.load();		//<-실행 먼저
						
						SelectCon selCon = loader.getController();		//<-실행하면 loader.getController접근이 정상적으로 가능해집니다. load() 메소드 실행이 일어나는 순간 해당 fxml과 거기에 연동된 컨트롤러가 생성되는 형태인 듯 해요.
																		//실제로 root = loader.load()와 순서를 바꾸면 NullPointException이 뜹니당
						
						selCon.select(tempNum);				//<-저희가 getController()에 접속한 이유는 그곳으로 tempNo(BoardNo)을 넘겨주기 위함입니다.							
															//select는 SelecCon클래스에 정의된 메소드입니다. 기능은 그곳에서 설명하는게...
						
						scene = new Scene(root);			//<-할꺼 다했으니 scene만들고
						scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	//<-스타일시트 입히고(css작업을 할 예정이라면)
						stage.setScene(scene);	//<-stage 만들어서
						
						stage.show();	//<-show me the stage. 즉, Select.fxml 신으로 넘어가겠다는 의미입니다.
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					
					
				}
				
			}
			
		});
	}
	
	
	//게시글 생성 버튼과 연동되는 메소드에요!
	public void create(ActionEvent event) {
		try {
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Create.fxml"));		//<-Create.fxml 이라는 신을 새로 만들었습니다! 그곳으로 넘어갈거에요!
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
