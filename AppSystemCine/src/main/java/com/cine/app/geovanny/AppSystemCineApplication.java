package com.cine.app.geovanny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.stage.Stage;

@SpringBootApplication
public class AppSystemCineApplication extends Application {

	public static ConfigurableApplicationContext applicationContext;
	public static Parent parent;
	public static Stage stage;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			applicationContext = SpringApplication.run(AppSystemCineApplication.class);
			System.out.println("fxml : " + getClass().getResource("/fxml/ViewMain.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ViewMain.fxml"));
			loader.setControllerFactory(applicationContext::getBean);
			parent = loader.load();
			Scene scene = new Scene(parent);
			
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}