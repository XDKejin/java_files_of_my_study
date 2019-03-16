package test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;

public class DialogController {

	@FXML private Button dialog;

	@FXML protected void openDialog(){
		TextInputDialog textInputDialog = new TextInputDialog();
	}



}
