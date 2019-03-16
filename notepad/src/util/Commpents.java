package util;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Commpents {

	/**
	 * 		the commpents of notepad
	 */
	private static Stage overallStage = new Stage(); 	//top-level commpent of window

	private static ScrollPane scrollPane;	//TextArea's parent





	private static TextArea textArea;		//is editable


	public static void setTextArea(TextArea textArea) {
		Commpents.textArea = textArea;
	}

	public static Stage getOverallStage() {
		return overallStage;
	}
	public static ScrollPane getScrollPane() {
		return scrollPane;
	}
	public static TextArea getTextArea() {
		return textArea;
	}



}
