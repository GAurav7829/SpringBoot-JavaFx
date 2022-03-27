package com.grv.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grv.services.HelloService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;

@Component
@FxmlView("/ui/login.fxml")
public class LoginController {
	@Autowired
	private HelloService service;
	
	@FXML
    private Label helloLbl;
	
	@FXML
    void serviceTextAction() {
		helloLbl.setText(service.sayHello());
    }
}
