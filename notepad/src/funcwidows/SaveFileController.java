package funcwidows;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.Commpents;
import util.ReadAndWriteFile;
import util.SysInfo;


import java.io.IOException;

public class SaveFileController {
	@FXML TextField inputFileName;
	@FXML Button cancelS;
	@FXML Label operationInfo;

	@FXML private void saveFile() {
		try {
			System.out.println(inputFileName.getText());

			ReadAndWriteFile.writeFile(inputFileName.getText(),Commpents.getTextArea().getText());
		} catch (IOException e) {
			e.printStackTrace();
		}

		operationInfo.setText("已保存");
		SysInfo.setSAVED(true);

	}

	@FXML private void cancelSave(){
		Stage stage = (Stage)cancelS.getScene().getWindow();
		stage.close();
	}

}
