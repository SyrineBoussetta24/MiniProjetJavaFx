package controllers;

import java.io.IOException;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;	
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import javafx.stage.Stage;
import javafx.util.Duration;

public class MainController implements Initializable {
	    @FXML
	    private VBox VBox;

	    @FXML
	    private Button btn_seconnecter;

	    @FXML
	    private Button btn_sinscrire;
	    
	    @FXML
	    private Parent fxml;

	    @FXML
	    void openSignUn() {
	    	TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
	    	t.setToX(5);
			t.play();
			t.setOnFinished(e ->{
				try {
					fxml = FXMLLoader.load(getClass().getResource("/FXMLL/SignUp.fxml"));
					VBox.getChildren().removeAll();
					VBox.getChildren().setAll(fxml);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			});
	    }

	    @FXML
	    void openSignin() {
	    	TranslateTransition t = new TranslateTransition(Duration.seconds(1),VBox);
			t.setToX(VBox.getLayoutX() * 5.5);
			t.play();
			t.setOnFinished(e ->{
				try {
					fxml = FXMLLoader.load(getClass().getResource("/FXMLL/SignIn.fxml"));
					VBox.getChildren().removeAll();
					VBox.getChildren().setAll(fxml);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			});
	    	
	    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TranslateTransition t = new TranslateTransition(Duration.seconds(1),VBox);
		t.setToX(VBox.getLayoutX() * 5.5);
		t.play();
	}

}
