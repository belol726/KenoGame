import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaFXTemplate extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to JavaFX");
		
		
		
				
		Scene scene = new Scene(new VBox(), 700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
