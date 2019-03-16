package test;

import javafx.application.Application;
import javafx.stage.Stage;
import util.FileSelect;

import java.io.File;


public class FileChooserTest extends Application {
	FileSelect fileReadWrite = new FileSelect();

	@Override
	public void start(Stage primaryStage) throws Exception {

/**
 * test file chooser
 */
		File choosedFile = fileReadWrite.readFromFile();
		System.out.println(choosedFile.toPath().toString());


	}
}
