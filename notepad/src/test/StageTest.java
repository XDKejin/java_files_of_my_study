package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.Commpents;

public class StageTest extends Application {

	//define  a stage as a whole situation;
	//Stage overallStage = new Stage();

	@Override
	public void start(Stage overallStage) throws Exception {
		overallStage = Commpents.getOverallStage();

		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		overallStage.setTitle("Hello World");
		Scene scene = new Scene(root);

		overallStage.setScene(scene);
		overallStage.show();

		double a = overallStage.getHeight();
		double b = overallStage.getWidth();

		System.out.println(a+"  " + b);


	}


	public static void main(String[] args) {
		launch(args);
	}
}
