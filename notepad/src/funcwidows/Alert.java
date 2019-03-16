package funcwidows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import util.SysInfo;

public class Alert extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		AnchorPane anchorPane = new AnchorPane();
		Label message = new Label(SysInfo.getAlertString());
		//Label message = new Label("alert");
		message.setLayoutX(60);
		message.setLayoutY(50);

		anchorPane.getChildren().addAll(message);

		Scene scene = new Scene(anchorPane,300,200);

		primaryStage.setScene(scene);
		primaryStage.show();


	}
}
