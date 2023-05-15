package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

//****************************************************************************************************
//
//                                Main class of the program.
//                         This is where the program starts running.
//
//                                  By: Travis Pearson
//                                  Finished on: 04/29/2023
//****************************************************************************************************



public class Main extends Application {
	
	//Setting stage(window)for the application to show. This also connects the scene/stage to
	//the FXML and CSS files.
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("metric-conversion.fxml"));
			Scene scene = new Scene(root);
			Image icon = new Image("metricAppLogo.png");
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			
			
			
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Metric Conversion Application");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Main method that launches the program
	public static void main(String[] args) {
		launch(args);
	}
}
