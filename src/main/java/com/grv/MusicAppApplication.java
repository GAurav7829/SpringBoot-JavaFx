package com.grv;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class MusicAppApplication {
	
	public static void main(String[] args) {
		Application.launch(FXApplication.class, args);
	}
}
