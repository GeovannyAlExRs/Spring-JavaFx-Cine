package com.cine.app.geovanny.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cine.app.geovanny.model.Roles;
import com.cine.app.geovanny.repository.IRepositoryRoles;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

@Component
public class ControllerMain implements Initializable{
	
	@Autowired
	private IRepositoryRoles iroles;
	
	@Autowired
	@Qualifier("lblTitulo")
	private String titulo;
	
	@FXML
	private Label lblTitulo;
	
	@FXML
	private TextField txtFName, txtFStatus;
	
	@FXML
	private TextArea txtADescription;
	
	@FXML
	public void onSave() {
		Roles roles = new Roles();
		
		roles.setRol_name(txtFName.getText());
		roles.setRol_name(txtADescription.getText());
		roles.setRol_name(txtFStatus.getText());
		
		iroles.save(roles);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblTitulo.setText(titulo);
		
	}

}
