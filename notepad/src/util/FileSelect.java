package util;

import javafx.stage.Stage;


import java.io.File;

public class FileSelect {

	final private static String initWritePath = "D:\\notepad\\files\\";

	private static String currentFileName ;

	/**
	 * 		don't need ;
	 */
	private static Stage fileStage = new Stage();



	/**
	 * choose file from file system
	 * @return choosed file
	 */
	public File readFromFile() {

		File currentFile;
 		javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
		fileChooser.setTitle("Open Resource File");

		fileChooser.getExtensionFilters().addAll(
				new javafx.stage.FileChooser.ExtensionFilter("Text Files", "*.txt"),
				new javafx.stage.FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new javafx.stage.FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
				new javafx.stage.FileChooser.ExtensionFilter("All Files", "*.*"));
		currentFile = fileChooser.showOpenDialog(fileStage.getOwner());
		if (currentFile != null) {
			System.out.println(currentFile.toPath().toString()); //测试选择文件
			return currentFile;
		}
		System.err.println("can't get slected File!!!");
		return null;
	}

	public static String getInitWritePath() {
		return initWritePath;
	}

	public static String getCurrentFileName() {
		return currentFileName;
	}

	public static void setCurrentFileName(String currentFileName) {
		FileSelect.currentFileName = currentFileName;
	}

	public static Stage getFileStage() {
		return fileStage;
	}

	public static void setFileStage(Stage fileStage) {
		FileSelect.fileStage = fileStage;
	}
}
