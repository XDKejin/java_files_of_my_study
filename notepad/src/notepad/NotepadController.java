package notepad;

import funcwidows.Alert;
import funcwidows.SaveFIle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import util.Commpents;
import util.FileSelect;
import util.ReadAndWriteFile;
import util.SysInfo;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class NotepadController implements Initializable,Runnable {

	@FXML private ScrollPane scrollPane;

	@FXML private TextArea textArea;
	@FXML private RadioMenuItem isReadOnly;

	@FXML private MenuItem creatF;
	@FXML private MenuItem openF;
	@FXML private MenuItem saveF;
	@FXML private MenuItem closeF;

	@FXML private MenuItem saveAndExit;




	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		SysInfo.setWindowSizeHeight(Commpents.getOverallStage().getHeight());
//		SysInfo.setWindowSizeWidth(Commpents.getOverallStage().getWidth());
//
//
//		scrollPane.setPrefSize(SysInfo.getWindowSizeWidth(), SysInfo.getWindowSizeHeight()-10);
//
//		scrollPane.setFitToWidth(true);


		Commpents.setTextArea(textArea);



		/**
		 * 		是否只读
		 */
		if (SysInfo.isReadOnly()) {
			textArea.setEditable(false);
		}else {
			textArea.setEditable(true);
		}

		this.run();

	}

	/**
	 * 	realted to RadioMenuItem , change the text's state of Reading and writing ;
	 * @param actionEvent
	 */



	/**
	* 		the operation of MENUITEM(file)
	*
	* */
	@FXML protected void changeReadWrite(ActionEvent actionEvent){
		if (isReadOnly.isSelected()) {
			textArea.setEditable(false);
			SysInfo.setReadOnly(true);
		} else {
			textArea.setEditable(true);
			SysInfo.setReadOnly(false);
		}
	}
	@FXML protected void newFile(ActionEvent actionEvent){
		if ("".equals(textArea.getText()) || SysInfo.isSAVED()){
			textArea.setText("");
		} else {
			SysInfo.setAlertString("请确认已将当前文件保存");
			(new Alert()).start(new Stage());
		}

	}
	@FXML protected void openFile(ActionEvent actionEvent){
		File openFile = (new FileSelect()).readFromFile();

		StringBuffer stringBuffer = ReadAndWriteFile.readFile(openFile.toPath().toString());
		textArea.setText(stringBuffer.toString());
	}
	@FXML protected void saveFile(ActionEvent actionEvent){
		try {
			(new SaveFIle()).start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@FXML protected void closeFile(ActionEvent actionEvent){

		textArea.setText("");

	}
	@FXML protected void saveAndExit(ActionEvent actionEvent){

		Stage stage = (Stage) textArea.getScene().getWindow();
		stage.close();
	}


	/**
	 * 	实时获取TextArea的内容
	 *
	 * */
	@Override
	public void run() {
		Commpents.setTextArea(textArea);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
